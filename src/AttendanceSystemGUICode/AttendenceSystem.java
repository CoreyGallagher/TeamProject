package AttendanceSystemGUICode;

/*
Team Project GUI
CLGT1
Lindsay Borthwick
Corey Gallagher
Mark Glenn
Brenda Kachidza
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class AttendenceSystem extends javax.swing.JFrame {

	// Instance variables
	private JButton jbtAdmin, jbtStudent, jbtLecturer, jbtDeptHead, picButton;
	private JPanel buttonPanel, picPanel;
	// private JLabel jlblOne;
	// private String jtfPassword;
	public JPasswordField jfPassword;
	public String userNameEntered, passwordEntered;
	private final String REQUIREDPASSWORD = "password";

	public AttendenceSystem() {
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 4));
		
		buttonPanel.add(jbtAdmin = new JButton("Administrator"));
		jbtAdmin.setFont(new java.awt.Font("Tahoma", 1, 20));
		jbtAdmin.setMnemonic('a');
		jbtAdmin.setHorizontalTextPosition(JButton.CENTER);
		jbtAdmin.setVerticalTextPosition(JButton.BOTTOM);
		jbtAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecurityDialog s2 = new SecurityDialog();
				s2.setTitle("Security Screen");
				s2.pack();
				s2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				s2.setLocationRelativeTo(null);
				s2.setVisible(true);
		s2.jbtOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//boolean p = false;
					userNameEntered = s2.jtfUsername.getText();
					passwordEntered = new String(s2.jtfPassword.getPassword());
					DatabaseHandler paswd = new DatabaseHandler();
					paswd.connectToDatabase();
					paswd.stmt = paswd.conn.createStatement();
					String sql = "Select Username, Password from AttendanceSystem.SystemUsers WHERE SystemUsers.Username='"
							+ userNameEntered + "' and SystemUsers.Password='" + passwordEntered + "'";
					paswd.doQuery(sql);
					// pst = passwd.conn.prepareStatement(sql);
					paswd.rs = paswd.stmt.executeQuery(sql);
					while(paswd.rs.next()) {
						if (userNameEntered.equals(paswd.rs.getString("SystemUsers.Username"))&&(passwordEntered.equals(paswd.rs.getString("SystemUsers.Password"))))
						{
						
								JOptionPane.showMessageDialog(null, "Login Successfully");
								AdminView adView = new AdminView();
								adView.setVisible(true);
								adView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								s2.dispose();
									System.out.print("logged in");

						} 
						
						else if(!paswd.rs.next()) 
 
						{
							JOptionPane.showMessageDialog(null, "Incorrect Login");
						}
						
						
					
					paswd.stmt.close();
					paswd.conn.close();
					}	
				} catch (Exception g) {
					// e.printStackTrace();
					JOptionPane.showMessageDialog(null, "PROBLEM OCCURED !!!! ");
				}
				
			}
			
		});
	}
});
		
		// adding jbtStudent to the buttonPanel
				buttonPanel.add(jbtStudent = new JButton("Student"));
				jbtStudent.setFont(new java.awt.Font("Tahoma", 1, 20));
				jbtStudent.setMnemonic('s');
				jbtStudent.setHorizontalTextPosition(JButton.CENTER);
				jbtStudent.setVerticalTextPosition(JButton.BOTTOM);
				add(buttonPanel, BorderLayout.SOUTH);
				
				
				// Event handling
				jbtStudent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SecurityDialog s1 = new SecurityDialog();
						s1.setTitle("Security Screen");
						s1.pack();
						// Add the DISPOSE_ON_CLOSE operation to dialog
						s1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						s1.setLocationRelativeTo(null);
						s1.setVisible(true);

				s1.jbtOK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							userNameEntered = s1.jtfUsername.getText();
							passwordEntered = new String(s1.jtfPassword.getPassword());
							DatabaseHandler passwd = new DatabaseHandler();
							passwd.connectToDatabase();
							passwd.stmt = passwd.conn.createStatement();
							String sql = "Select StudentNumber, Password from AttendanceSystem.Student Where Student.StudentNumber='"
									+ userNameEntered + "' and Student.Password='" + passwordEntered + "'";
							passwd.doQuery(sql);
							// pst = passwd.conn.prepareStatement(sql);
							passwd.rs = passwd.stmt.executeQuery(sql);
							while (passwd.rs.next()) {
								if (userNameEntered.equals(passwd.rs.getString("Student.StudentNumber"))) {
									if (passwordEntered.equals(passwd.rs.getString("Student.Password"))) {
										JOptionPane.showMessageDialog(null, "Login Successful");
										ASJtableStudentView StudView = new ASJtableStudentView();
										StudView.setVisible(true);
										StudView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
										s1.dispose();
										System.out.print("logged in");

									} else {
										JOptionPane.showMessageDialog(null, "Incorrect Password");
									}
								} else {
									JOptionPane.showMessageDialog(null, "Incorrect Login");
								}
							}
							passwd.stmt.close();
							passwd.conn.close();
						} catch (Exception g) {
							// e.printStackTrace();
							JOptionPane.showMessageDialog(null, "PROBLEM OCCURED !!!! ");
						}
					}
				});
			}
		});
		
		
		//L00221133 12345l
		
		
		// buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		buttonPanel.add(jbtLecturer = new JButton("Lecturer"));
		jbtLecturer.setFont(new java.awt.Font("Tahoma", 1, 20));
		jbtLecturer.setMnemonic('l');
		jbtLecturer.setHorizontalTextPosition(JButton.CENTER);
		jbtLecturer.setVerticalTextPosition(JButton.BOTTOM);



		
		
		// Event handling


		jbtLecturer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecurityDialog s1 = new SecurityDialog();
				s1.setTitle("Security Screen");
				s1.pack();
				s1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				s1.setLocationRelativeTo(null);
				s1.setVisible(true);

				s1.jbtOK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							userNameEntered = s1.jtfUsername.getText();
							passwordEntered = new String(s1.jtfPassword.getPassword());
							DatabaseHandler passwd = new DatabaseHandler();
							passwd.connectToDatabase();
							passwd.stmt = passwd.conn.createStatement();
							String sql = "Select LecturerID, Password from AttendanceSystem.Lecturer Where Lecturer.LecturerID='"
									+ userNameEntered + "' and Lecturer.Password='" + passwordEntered + "'";
							passwd.doQuery(sql);
							// pst = passwd.conn.prepareStatement(sql);
							passwd.rs = passwd.stmt.executeQuery(sql);
							while (passwd.rs.next()) {
								if (userNameEntered.equals(passwd.rs.getString("Lecturer.LecturerID"))) {
									if (passwordEntered.equals(passwd.rs.getString("Lecturer.Password"))) {
										JOptionPane.showMessageDialog(null, "Login Successfully");
										ASJtableLectSelect Asjls = new ASJtableLectSelect();
										Asjls.setVisible(true);
										Asjls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
										s1.dispose();
										System.out.print("logged in");

									} else {
										JOptionPane.showMessageDialog(null, "Incorrect Password");
									}
								} else {
									JOptionPane.showMessageDialog(null, "Incorrect Login");
								}
							}
							passwd.stmt.close();
							passwd.conn.close();
						} catch (Exception g) {
							// e.printStackTrace();
							JOptionPane.showMessageDialog(null, "PROBLEM OCCURED !!!! ");
						}
					}
				});
			}
		});

		// buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(jbtDeptHead = new JButton("Dept Head"));
		jbtDeptHead.setFont(new java.awt.Font("Tahoma", 1, 20));
		jbtDeptHead.setMnemonic('d');
		jbtDeptHead.setHorizontalTextPosition(JButton.CENTER);
		jbtDeptHead.setVerticalTextPosition(JButton.BOTTOM);
		jbtDeptHead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecurityDialog s1 = new SecurityDialog();
				s1.setTitle("Security Screen");
				s1.pack();
				s1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				s1.setLocationRelativeTo(null);
				s1.setVisible(true);
		s1.jbtOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userNameEntered = s1.jtfUsername.getText();
					passwordEntered = new String(s1.jtfPassword.getPassword());
					DatabaseHandler passwd = new DatabaseHandler();
					passwd.connectToDatabase();
					passwd.stmt = passwd.conn.createStatement();
					String sql = "Select Username, Password from AttendanceSystem.SystemUsers WHERE SystemUsers.Username='"
							+ userNameEntered + "' and SystemUsers.Password='" + passwordEntered + "'";
					passwd.doQuery(sql);
					// pst = passwd.conn.prepareStatement(sql);
					passwd.rs = passwd.stmt.executeQuery(sql);
					while (passwd.rs.next()) {
						if (userNameEntered.equals(passwd.rs.getString("SystemUsers.Username"))) {
							if (passwordEntered.equals(passwd.rs.getString("SystemUsers.Password"))) {
								JOptionPane.showMessageDialog(null, "Login Successfully");
								ASJtableHDSelect DptSelect = new ASJtableHDSelect();
								DptSelect.setVisible(true);
								DptSelect.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								s1.dispose();
								System.out.print("logged in");

							} else {
								JOptionPane.showMessageDialog(null, "Incorrect Password");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Incorrect Login");
						}
					}
					passwd.stmt.close();
					passwd.conn.close();
				} catch (Exception g) {
					// e.printStackTrace();
					JOptionPane.showMessageDialog(null, "PROBLEM OCCURED !!!! ");
				}
			}
		});
	}
});


		// setting the cover photo off the homepage
		picPanel = new JPanel();
		// set up college photo
		picButton = new JButton("LYIT", new ImageIcon("img/Lyit5.jpg"));
		// Center the icon and text and place the text under the icon
		picButton.setHorizontalTextPosition(JButton.CENTER);
		picButton.setVerticalTextPosition(JButton.TOP);
		picButton.setFont(new Font("Impact", Font.BOLD, 20));
		picButton.setBackground(Color.LIGHT_GRAY);
		picButton.setMnemonic('L');
		picPanel.add(picButton, BorderLayout.NORTH);
		add(picPanel);

	}

	public static void main(String[] args) {
		AttendenceSystem frame = new AttendenceSystem();
		frame.setTitle("Attendance System");
		// frame.pack();
		frame.setSize(800, 390);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
