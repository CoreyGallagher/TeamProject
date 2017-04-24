package AttendanceSystemGUICode;
/**
 * Student Menu
 *
 * @author Cloud Grp1
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ASJtableStudentView extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	// constructor
	public ASJtableStudentView() {
		initComponents();
	}

	// initialize components
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {
		// components
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 153, 0));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student View",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 12))); // NOI18N

		// setting the logo and text of the jLabel
		jLabel1.setText("jLabel1");
		jLabel1.setIcon(new javax.swing.ImageIcon(("img/lyitLogo.png")));

		// Setting the Characteristics of the View Attendance Button
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setMnemonic('v');
		jButton1.setText("View Attendance");
		jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		// ADDING ACTION LISTENER TO THE VIEW ATTENDANCE BUTTON
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentViewTable ViewATD = new StudentViewTable();
				ViewATD.setVisible(true);
				ViewATD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				// System.out.print(" "+AttendenceSystem.getUserNameEntered());
			}
		});

		// Setting the characteristics of the Combo Box
		jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12));
		//jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALGSCP701", "MANGCP701", "DATACP701" }));
		ArrayList<String> Modules = new ArrayList<String>();
		try{
			
		
		DatabaseHandler DB = new DatabaseHandler();
		DB.connectToDatabase();
		String selectQuery = "SELECT ModuleCode FROM AttendanceSystem.Module";
		DB.stmt.executeUpdate("Use AttendanceSystem");
		ResultSet rs = DB.stmt.executeQuery(selectQuery);
		
		
		while(rs.next() != false)
		{
			Modules.add(rs.getString("ModuleCode"));
		}
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		jComboBox1.setModel(
				new javax.swing.DefaultComboBoxModel(Modules.toArray()));
	
		jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		
			
		jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				//jComboBox1ActionPerformed(evt);
			}
		});
		jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		jLabel2.setDisplayedMnemonic('m');
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel2.setText("Module");
		jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
		// netbeans window builder layout and positioning of components
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
						.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
										.createSequentialGroup().addGap(97, 97, 97)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
														152, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(54, 54, 54).addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE, 263,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(89, 89, 89).addComponent(
										jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(56, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(21, 21, 21)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(39, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		// pack frame
		pack();
	}

	// create frame and display
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ASJtableStudentView.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ASJtableStudentView.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ASJtableStudentView.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ASJtableStudentView.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ASJtableStudentView().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jButton1;
	@SuppressWarnings("rawtypes")
	public static javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;

}// end of class
