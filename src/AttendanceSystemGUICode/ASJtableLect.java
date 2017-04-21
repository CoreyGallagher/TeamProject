package AttendanceSystemGUICode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Lecturer Marks Attendance
 *
 * @author Cloud Grp1
 */
@SuppressWarnings("serial")
public class ASJtableLect extends javax.swing.JFrame {
	// constructor
	public ASJtableLect() {
		initComponents();
		showTable();
	}

	// initialize components
	private void initComponents() {
		// components
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jButton4 = new javax.swing.JButton();
		// set JTable model
		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);
		// dispose on close
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Lecturer ");

		jPanel1.setBackground(new java.awt.Color(0, 204, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Record Attendance", 0, 0,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		jTable2.setGridColor(new java.awt.Color(0, 0, 0));
		jTable2.setInheritsPopupMenu(true);
		jTable2.setRowHeight(21);
		jScrollPane3.setViewportView(jTable2);

		jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
				// set JTable column headings
		}, new String[] { "StudentID", "LastName", "FirstName", "Hours", "Present" }) {
			public java.lang.Class<?> getColumnClass(int column) {
				switch (column) {
				case 0:
					return String.class;
				case 1:
					return String.class;
				case 2:
					return String.class;
				case 3:
					return Integer.class;
				default:
					return Boolean.class;
				}
			}
		});
		jTable2.setGridColor(new java.awt.Color(0, 0, 0));
		jTable2.setInheritsPopupMenu(true);
		jTable2.setRowHeight(21);
		jScrollPane3.setViewportView(jTable2);
		jLabel1.setText("Class Hours");
		// hours JComboBox and event handling
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
		jComboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Security password for entry to add bonus
				String value = (String) jComboBox1.getSelectedItem();
				int rowCount;
				rowCount = jTable2.getRowCount();

				for (int i = 0; i < rowCount; i++) {
					jTable2.setValueAt(value, i, 3);
				}
			}
		});
		// table listener set hours to zero if not present
		jTable2.getModel().addTableModelListener(new TableModelListener() {
			public void tableChanged(TableModelEvent e) {
				if (e.getType() == TableModelEvent.UPDATE) {
					int row = e.getFirstRow();
					int column = e.getColumn();
					// present box unticked
					if (column == 4) {
						TableModel model = (TableModel) e.getSource();
						model.setValueAt(0, row, 3);
					}
				}
			}
		});

		// event handling save button
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					java.util.Date date = new java.util.Date();
					java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String currentTime = sdf.format(date);
					DatabaseHandler dbh = new DatabaseHandler();
					dbh.connectToDatabase();
					String value = (String) jComboBox1.getSelectedItem();
					dbh.stmt = dbh.conn.createStatement();
					// update database when attendance complete
					for (int i = 0; i <= jTable2.getRowCount(); i++) {

						String studNo = jTable2.getValueAt(i, 0).toString();
						String hours = jTable2.getValueAt(i, 3).toString();

						String dQuery = ("UPDATE AttendanceSystem.AttendanceRecords SET Date = '" + currentTime
								+ "' WHERE StudentNo = + '" + studNo + "' AND ModuleCde = + '"
								+ ASJtableLectSelect.jComboBox1.getSelectedItem() + "'");

						String hQuery = ("UPDATE AttendanceSystem.AttendanceRecords SET HoursAttended = HoursAttended +'"
								+ hours + "' WHERE StudentNo = + '" + studNo + "' AND ModuleCde = + '"
								+ ASJtableLectSelect.jComboBox1.getSelectedItem() + "'");
						String UpdateQuery = ("UPDATE AttendanceSystem.AttendanceRecords SET ModuleHours = ModuleHours +'"
								+ value + "' WHERE StudentNo = + '" + studNo + "'AND ModuleCde = + '"
								+ ASJtableLectSelect.jComboBox1.getSelectedItem() + "'");
						//dbh.doQuery(dQuery);
						//dbh.doQuery(hQuery);

						//dbh.doQuery(UpdateQuery);
						dbh.stmt.executeUpdate(dQuery);
						dbh.stmt.executeUpdate(hQuery);
						dbh.stmt.executeUpdate(UpdateQuery);

					}
					// close database connection
					dbh.rs.close();
					dbh.conn.close();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
		});
		// set save button fonts etc
		jButton4.setFont(new java.awt.Font("Tahoma", 1, 12));
		jButton4.setMnemonic('s');
		jButton4.setText("SAVE ");
		jButton4.setBorder(null);

		// netbeans window builder code for layout and component positioning
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(67, 67, 67).addComponent(jLabel1)
						.addGap(33, 33, 33)
						.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		// pack frame
		pack();
	}

	// show attendance table for marking
	public void showTable() {

		try {
			// database handler
			DatabaseHandler db = new DatabaseHandler();
			// connect to database
			db.connectToDatabase();

			// create query and pass into doQuery method
			String selectQuery = "SELECT Student.StudentNumber, Student.StudentLastName, Student.StudentFirstname, StudentModules.Module FROM Student JOIN StudentModules ON Student.StudentNumber=StudentModules.StudentIdentity WHERE Student.StudCourseCode ='"
					+ ASJtableLectSelect.jComboBox2.getSelectedItem() + "' AND StudentModules.Module = '"
					+ ASJtableLectSelect.jComboBox1.getSelectedItem() + "'";

			db.stmt.executeUpdate("USE AttendanceSystem");
			ResultSet rs = db.stmt.executeQuery(selectQuery);
			// STEP 5(a) - Process results of the Query
			// add values to JTable
			while (rs.next() != false) {

				String StudentNo = rs.getString("StudentNumber");
				String last = rs.getString("StudentLastName");
				String first = rs.getString("StudentFirstName");

				System.out.println(StudentNo + " " + last + " " + first + " ");
				boolean present = true;

				Object[] content = { StudentNo, last, first, null, present };

				DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

				model.addRow(content);

				System.out.println("STEP 5(a) COMPLETE - Results of Query processed...");

			}
			// error handling
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Problem with SQL.\n" + e.getMessage());
		} finally {

		}

	}

	// create frame and set visible
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ASJtableLect.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ASJtableLect.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ASJtableLect.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ASJtableLect.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ASJtableLect().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jButton4;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;

}// end of class