package AttendanceSystemGUICode;

/**
 * Administrator Adds Student To Course
 *
 * @author Cloud Grp1
 */
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ASJtableAdmin extends javax.swing.JFrame {

	/**
	 * Creates new form ASJtable
	 */
	public ASJtableAdmin() {
		setPreferredSize(new Dimension(444, 573));
		setResizable(false);
		setMaximumSize(new Dimension(2147483647, 2147483645));
		initComponents();
	}

	// initialize frame components
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {
		// JFrame components
		jPanel1 = new javax.swing.JPanel();
		jLabelStudent = new javax.swing.JLabel();
		jLabelLN = new javax.swing.JLabel();
		jLabelFN = new javax.swing.JLabel();
		jLabelCourse = new javax.swing.JLabel();
		jLabelPaswd = new javax.swing.JLabel();
		jTextFieldLN = new javax.swing.JTextField();
		jTextFieldFN = new javax.swing.JTextField();
		jTextFieldPaswd = new javax.swing.JTextField();
		jButtonAdd = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable_TableAS = new javax.swing.JTable();
		jTextFieldStudent = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox<String>();
		// exit on close
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 0, 0));
		// set background color and border
		jPanel1.setBackground(new java.awt.Color(51, 204, 255));
		jPanel1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Add Student to Course",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0))); // NOI18N
		// set JLabel Text
		jLabelStudent.setText("StudentID");

		jLabelLN.setText("Last Name");

		jLabelFN.setText("First Name");

		jLabelCourse.setText("Course");

		jLabelPaswd.setText("Password");
		// add action listener to last name
		jTextFieldLN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldLNActionPerformed(evt);
			}
		});
		// set text and add action listener to add JButton
		jButtonAdd.setMnemonic('a');
		jButtonAdd.setText("ADD");
		jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddActionPerformed(evt);
			}
		});

		// finish button
		jButton2.setMnemonic('f');
		jButton2.setText("FINISH");
		jButton2.setToolTipText("");

		jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));

		jTable_TableAS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
				new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0),
				new java.awt.Color(255, 0, 51)));
		jTable_TableAS.setForeground(new java.awt.Color(255, 0, 0));
		jTable_TableAS.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "StudentID", "LastName", "FirstName", "Password", "Course" }));
		jScrollPane1.setViewportView(jTable_TableAS);
		// delete button
		jButton1.setMnemonic('d');
		jButton1.setText("DELETE");

		jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "CLGTS1", "CSDFS1", "COMPS1" }));
		// net beans window builder positioning of components
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap(44, Short.MAX_VALUE)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelStudent, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonAdd, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabelLN).addComponent(jLabelFN).addComponent(jLabelPaswd)
								.addComponent(jLabelCourse))
								.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 101,
														GroupLayout.PREFERRED_SIZE)
												.addGap(56).addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 95,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(jTextFieldStudent, Alignment.TRAILING)
												.addComponent(jTextFieldLN, Alignment.TRAILING)
												.addComponent(jTextFieldFN, Alignment.TRAILING)
												.addComponent(jTextFieldPaswd, Alignment.TRAILING).addComponent(
														jComboBox1, Alignment.TRAILING, 0, 130, Short.MAX_VALUE)))))
				.addGap(244)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabelStudent, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldStudent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabelLN, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE).addComponent(
										jTextFieldLN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabelFN)
								.addComponent(jTextFieldFN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(1)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabelPaswd, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldPaswd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabelCourse)
								.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(49)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jButtonAdd, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)));
		jPanel1Layout.linkSize(SwingConstants.VERTICAL,
				new Component[] { jLabelStudent, jLabelLN, jLabelFN, jLabelCourse });
		jPanel1Layout.linkSize(SwingConstants.VERTICAL,
				new Component[] { jTextFieldLN, jTextFieldFN, jTextFieldPaswd, jTextFieldStudent });
		jPanel1Layout.linkSize(SwingConstants.HORIZONTAL,
				new Component[] { jLabelStudent, jLabelLN, jLabelFN, jLabelCourse, jLabelPaswd });
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
						.addGap(269)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE).addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
	}

	// add action listener to JTextfield
	private void jTextFieldLNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldLNActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldLNActionPerformed

	// add action event to add button
	private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddActionPerformed
		try {
			// connect to database and execute query
			DatabaseHandler dbh = new DatabaseHandler();
			dbh.connectToDatabase();
			// insert student into course
			String insertQuery = ("insert into AttendanceSystem.Student(StudentNumber, StudentLastName, StudentFirstName, Password, StudCourseCode) values ('"
					+ jTextFieldStudent.getText() + "','" + jTextFieldLN.getText() + "','" + jTextFieldFN.getText()
					+ "','" + jTextFieldPaswd.getText() + "','" + jComboBox1.getSelectedItem() + "')");
			dbh.doQuery(insertQuery);
			dbh.stmt = dbh.conn.createStatement();
			dbh.stmt.executeUpdate(insertQuery);
			JOptionPane.showMessageDialog(null, "Query Executed");
			DefaultTableModel model = (DefaultTableModel) jTable_TableAS.getModel();
			model.addRow(new Object[] { jTextFieldStudent.getText(), jTextFieldLN.getText(), jTextFieldFN.getText(),
					jComboBox1.getSelectedItem(), jTextFieldPaswd.getText() });
			// error handling
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

	@SuppressWarnings("unused")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			DatabaseHandler dbh = new DatabaseHandler();
			dbh.connectToDatabase();

			String deleteQuery = ("delete from AttendanceSystem.Student WHERE StudentNumber = '"
					+ jTextFieldStudent.getText() + "'");

			dbh.doQuery(deleteQuery);
			dbh.stmt = dbh.conn.createStatement();
			dbh.stmt.executeUpdate(deleteQuery);

			dbh.rs.close();
			dbh.conn.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
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
			java.util.logging.Logger.getLogger(ASJtableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ASJtableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ASJtableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ASJtableAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// create and display frame
		ASJtableAdmin frame = new ASJtableAdmin();
		frame.setTitle("Administrator");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	// Variables declaration
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButtonAdd;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabelCourse;
	private javax.swing.JLabel jLabelFN;
	private javax.swing.JLabel jLabelLN;
	private javax.swing.JLabel jLabelPaswd;
	private javax.swing.JLabel jLabelStudent;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable_TableAS;
	private javax.swing.JTextField jTextFieldFN;
	private javax.swing.JTextField jTextFieldLN;
	private javax.swing.JTextField jTextFieldPaswd;
	private javax.swing.JTextField jTextFieldStudent;

}
