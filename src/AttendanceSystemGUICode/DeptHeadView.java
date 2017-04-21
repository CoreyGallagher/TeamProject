package AttendanceSystemGUICode;
/**
 * Dept Head View Attendance Records
 *
 * @author Cloud Grp1
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class DeptHeadView extends javax.swing.JFrame {

	// constructor
	public DeptHeadView() {
		initComponents();
		showTable();
	}

	// initialize components
	private void initComponents() {
		// components
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jPanel1.setBackground(new java.awt.Color(0, 204, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Attendance",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12)));
		// add column names to JTable
		jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] { "StudentID",
				"Last Name", "First Name", "Hours Attended", "Module Hours", "Attendance %" }));
		jTable1.setName("View Attendance");
		jScrollPane1.setViewportView(jTable1);
		jTable1.setEnabled(false);

		// netbeans window builder layout and component positioning
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(15, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(28, 28, 28)));
		// pack frame
		pack();
	}

	// show JTable
	public void showTable() {

		try {
			DatabaseHandler db = new DatabaseHandler();
			// connect to database
			db.connectToDatabase();

			// create query and pass into doQuery method & get attendance
			// records from database
			String selectQuery = "SELECT AttendanceRecords.Date, AttendanceRecords.ModuleCde, AttendanceRecords.CourseCde, AttendanceRecords.HoursAttended, AttendanceRecords.ModuleHours, Student.StudentLastName, Student.StudentFirstname FROM AttendanceRecords JOIN Student ON AttendanceRecords.StudentNo=Student.StudentNumber WHERE Student.StudCourseCode ='"
					+ ASJtableHDSelect.jComboBox2.getSelectedItem() + "' AND AttendanceRecords.ModuleCde = '"
					+ ASJtableHDSelect.jComboBox1.getSelectedItem() + "'";
			// db.doQuery(selectQuery);

			db.stmt.executeUpdate("USE AttendanceSystem");
			ResultSet rs = db.stmt.executeQuery(selectQuery);
			// STEP 5(a) - Process results of the Query
			while (rs.next() != false) {

				String Date = rs.getString("Date");
				String ModHours = rs.getString("ModuleHours");
				String HoursAtt = rs.getString("HoursAttended");
				String fName = rs.getString("StudentFirstName");
				String lName = rs.getString("StudentLastName");
				Object[] content = { Date, lName, fName, HoursAtt, ModHours, null };

				DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

				model.addRow(content);

				System.out.println("STEP 5(a) COMPLETE - Results of Query processed...");
				// add results to JTable
				for (int j = 0; j < jTable1.getRowCount(); j++) {

					String hoursAttd = jTable1.getValueAt(j, 3).toString();
					double hoursAttended = Integer.parseInt(hoursAttd);
					String moduleHrs = jTable1.getValueAt(j, 4).toString();
					double Module = Integer.parseInt(moduleHrs);

					double total = (hoursAttended / Module) * 100;

					jTable1.setValueAt(total, j, 5);

				}

			}
			// error handling
		} catch (SQLException e) {
			System.out.println("Problem with SQL.\n" + e.getMessage());
		}

	}

	// create and display frame
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ASJtableView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ASJtableView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ASJtableView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ASJtableView.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		ASJtableView viewAtt = new ASJtableView();
		viewAtt.setVisible(true);
		viewAtt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	// Variables declaration
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;

}// end of class
