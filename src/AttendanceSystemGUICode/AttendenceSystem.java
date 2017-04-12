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

		// creating buttonPanel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 4));
		// buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(jbtAdmin = new JButton("Administrator"));
		jbtAdmin.setFont(new java.awt.Font("tahoma", 1, 20));
		jbtAdmin.setMnemonic('A');
		jbtAdmin.setHorizontalTextPosition(JButton.CENTER);
		jbtAdmin.setVerticalTextPosition(JButton.BOTTOM);
		add(buttonPanel, BorderLayout.SOUTH);

		// Event handling
		jbtAdmin.addActionListener(new ActionListener() {
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
						// getText() in jtfUsername and jtfPassword
						userNameEntered = s1.jtfUsername.getText();
						passwordEntered = new String(s1.jtfPassword.getPassword());

						if (passwordEntered.equals(REQUIREDPASSWORD)) {
							
							AdminView Admin = new AdminView();
							Admin.setVisible(true);
							Admin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							s1.dispose();
						} else {
						
							JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD ENTERED", "PASSWORD ERROR",
									JOptionPane.ERROR_MESSAGE);
							
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
						// getText() in jtfUsername and jtfPassword
						userNameEntered = s1.jtfUsername.getText();
						passwordEntered = new String(s1.jtfPassword.getPassword());
						if (passwordEntered.equals(REQUIREDPASSWORD)) {
							ASJtableStudentView StudView = new ASJtableStudentView();
							StudView.setVisible(true);
							StudView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							s1.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD ENTERED", "PASSWORD ERROR",
									JOptionPane.ERROR_MESSAGE);
						}
					}

				});
			}
		});
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
				// Add the DISPOSE_ON_CLOSE operation to dialog
				s1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				s1.setLocationRelativeTo(null);
				s1.setVisible(true);

				s1.jbtOK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// getText() in jtfUsername and jtfPassword
						userNameEntered = s1.jtfUsername.getText();
						passwordEntered = new String(s1.jtfPassword.getPassword());
						if (passwordEntered.equals(REQUIREDPASSWORD)) {
							ASJtableLectSelect Asjls = new ASJtableLectSelect();
							Asjls.setVisible(true);
							Asjls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							s1.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD ENTERED", "PASSWORD ERROR",
									JOptionPane.ERROR_MESSAGE);
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

		// Event handling
		jbtDeptHead.addActionListener(new ActionListener() {
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
						// getText() in jtfUsername and jtfPassword
						userNameEntered = s1.jtfUsername.getText();
						passwordEntered = new String(s1.jtfPassword.getPassword());
						if (passwordEntered.equals(REQUIREDPASSWORD)) {
							ASJtableHDSelect DptSelect = new ASJtableHDSelect();
							DptSelect.setVisible(true);
							DptSelect.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							s1.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD ENTERED", "PASSWORD ERROR",
									JOptionPane.ERROR_MESSAGE);
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
