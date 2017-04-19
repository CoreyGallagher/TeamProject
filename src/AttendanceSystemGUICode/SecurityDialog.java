package AttendanceSystemGUICode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
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
		jlblImage = new JLabel(new javax.swing.ImageIcon(("img/lock.png")));
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

		// Add an ANONYMOUS LISTENER CLASS to jbtCancel
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}