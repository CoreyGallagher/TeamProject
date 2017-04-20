package AttendanceSystemGUICode;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

/**
 *
 * @author Cloud Grp1
 */
public class StudentViewTable extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2264879583094570126L;

	/**
	 * Creates new form StudentViewTable
	 */
	public StudentViewTable() {
		initComponents();
		showTable();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		jTable2.setEnabled(false);

		jPanel1.setBackground(new java.awt.Color(0, 204, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student View",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
		jTable2.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Date", "Hours Attended", "Module Hours", "Attendance %" }));
		jTable2.getColumnModel().getColumn(0).setPreferredWidth(70);
		jTable2.getColumnModel().getColumn(0).setMinWidth(13);
		jScrollPane2.setViewportView(jTable2);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE).addGap(11)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		
		pack();
	}

	public void showTable() {
		// String studentNumber = AttendanceSystem.s1.getUserNameEntered();
		try {
			DatabaseHandler db = new DatabaseHandler();
			// connect to database
			db.connectToDatabase();
			String selectQuery = "SELECT AttendanceRecords.Date, AttendanceRecords.StudentNo, AttendanceRecords.HoursAttended, AttendanceRecords.ModuleHours FROM AttendanceRecords WHERE AttendanceRecords.ModuleCde ='"
					+ ASJtableStudentView.jComboBox1.getSelectedItem() + "'AND AttendanceRecords.StudentNo= '"
					+ AttendenceSystem.getUserNameEntered() + "'";

			db.doQuery(selectQuery);

			db.stmt.executeUpdate("USE AttendanceSystem");
			ResultSet rs = db.stmt.executeQuery(selectQuery);
			// STEP 5(a) - Process results of the Query
			while (rs.next() != false) {

				// Can get columns by name, or number which starts at 1
				String Date = rs.getString("Date");
				String hoursAtt = rs.getString("HoursAttended");
				String modHours = rs.getString("ModuleHours");
				double hoursAttended = Integer.parseInt(hoursAtt);
				//String modHrs = jTable2.getValueAt(1, 4).toString();
				double Module = Integer.parseInt(modHours);

				double total = (hoursAttended / Module) * 100;
				
				System.out.println(Date + " " + hoursAtt + " " + modHours + " ");
				// boolean present = true;
				Object[] content = { Date, hoursAtt, modHours, total };
				DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
				//jTable2.setValueAt(total, j, 5);
				model.addRow(content);
				// model.addTableModelListener(jTable2);

				System.out.println("STEP 5(a) COMPLETE - Results of Query processed...");

			}
			db.conn.close();
		} catch (SQLException e) {
			System.out.println("Problem with SQL.\n" + e.getMessage());
		}

	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StudentViewTable.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new StudentViewTable().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable2;
}
