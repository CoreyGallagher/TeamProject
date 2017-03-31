package AttendanceSystemGUICode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class SecurityDialog extends JDialog {
	// Declare Components of our JDialog...

	// It has a JPanel with two JLabels...
	public JPanel jpLabels;
	public JLabel jlblUserName, jlblPassword, jlblImage;

	// ...a JPanel with a JTextField and JPasswordField...
	public JPanel jpTextFields;
	public JTextField jtfUsername;
	public JPasswordField jtfPassword;
	

	// ...and a JPanel with two JButtons
	public JPanel jpButtons;
	public static JButton jbtOK, jbtCancel;

	public String userNameEntered, passwordEntered;
	public final String requiredPassword = "Password";

	public SecurityDialog() {
		// Constructor - SetLayout & Add Components here...
		// Panel 1 - Two JLabels
		jpLabels = new JPanel(new GridLayout(2, 1));
		jlblImage=new JLabel(new javax.swing.ImageIcon(("img/lock.png")));
		jpLabels.add(jlblUserName = new JLabel("Username"));
		jpLabels.add(jlblPassword = new JLabel("Password"));
		
		// Panel 2 - A JTextField and a JPasswordField
		jpTextFields = new JPanel(new GridLayout(2, 1));
		jpTextFields.add(jtfUsername = new JTextField(15));
		jpTextFields.add(jtfPassword = new JPasswordField(15));
		jtfPassword.setEchoChar('*');

		// Panel32 - Three JButtons
		jpButtons = new JPanel();
		jpButtons.add(jbtOK = new JButton("OK"));
		jpButtons.add(jbtCancel = new JButton("Cancel"));

		// Set up the JFrame
		add(jlblImage, BorderLayout.NORTH);
		add(jpLabels, BorderLayout.WEST);
		add(jpTextFields, BorderLayout.CENTER);
		add(jpButtons, BorderLayout.SOUTH);
		// Add an ANONYMOUS LISTENER CLASS to jbtOK
		/*
		 * jbtOK.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { // getText() in jtfUsername and
		 * jtfPassword userNameEntered = jtfUsername.getText(); passwordEntered
		 * = new String(jtfPassword.getPassword()); if
		 * (passwordEntered.equals(requiredPassword)) { ASJtableHDSelect
		 * DptSelect = new ASJtableHDSelect(); DptSelect.setVisible(true);
		 * DptSelect.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 * s1.dispose(); } else { JOptionPane.showMessageDialog(null,
		 * "INCORRECT PASSWORD ENTERED", "PASSWORD ERROR",
		 * JOptionPane.ERROR_MESSAGE); } } });
		 */

		// Add an ANONYMOUS LISTENER CLASS to jbtCancel
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	/*
	 * public static void main(String[] args) { // CONSTRUCT a SecurityDialog
	 * object called dialog SecurityDialog dialog = new SecurityDialog();
	 * 
	 * dialog.setTitle("Security Screen"); dialog.pack(); // Add the
	 * DISPOSE_ON_CLOSE operation to dialog
	 * dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setLocationRelativeTo(null); dialog.setVisible(true); }
	 */
}