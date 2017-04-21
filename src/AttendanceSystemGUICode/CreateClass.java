package AttendanceSystemGUICode;
/**
 * Administrator Create New Course
 *
 * @author Cloud Grp1
 */

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class CreateClass extends javax.swing.JFrame {

	// constructor
	public CreateClass() {
		initComponents();
	}

	// initialize components
	private void initComponents() {
		// components
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		// dispose on close
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Administrator");
		// set names, fonts etc
		jPanel1.setBackground(new java.awt.Color(0, 204, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel1.setText("Course Code");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel2.setText("Course Name");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel3.setText("Module Code");

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setText("Create");
		jButton1.setActionCommand("");
		jButton1.setBorder(null);

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setText("    Create Class");
		// netbeans window builder layout and component positioning
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
						.createSequentialGroup().addGap(31, 31, 31).addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createSequentialGroup()
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														85, Short.MAX_VALUE)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
														104, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 138,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 138,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap())
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(99, 99, 99)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(114, 114, 114)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(28, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 8, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		// pack frame
		pack();
	}

	// event handling
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			// new database handler
			DatabaseHandler dbh1 = new DatabaseHandler();
			dbh1.connectToDatabase();
			// add course to database
			String insertQuery = ("insert into AttendanceSystem.Course(CourseCode, CourseName, ModuleCode) values ('"
					+ jTextField2.getText() + "','" + jTextField3.getText() + "','" + jTextField1.getText() + "')");
			dbh1.doQuery(insertQuery);
			dbh1.stmt = dbh1.conn.createStatement();
			dbh1.stmt.executeUpdate(insertQuery);
			JOptionPane.showMessageDialog(null, "Query Executed");
			// error handling
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
			java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CreateClass().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration
}// end of class
