package AttendanceSystemGUICode;
/**
 * Security Dialog For Home Page
 *
 * @author Cloud Grp1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SecurityDialog extends JDialog {

	// Declare Components of our JDialog...
	// It has a JPanel with two JLabels...
	public JPanel jpLabels;
	public JLabel jlblUserName, jlblPassword, jlblImage;

	// JPanel with JTextField and JPasswordField...
	public JPanel jpTextFields;
	public JTextField jtfUsername;
	public JPasswordField jtfPassword;

	// JPanel two JButtons
	public JPanel jpButtons;
	public static JButton jbtOK, jbtCancel;

	public String userNameEntered, passwordEntered;
	public final String requiredPassword = "Password";

	// constructor
	public SecurityDialog() {

		// JLabels and image
		jpLabels = new JPanel(new GridLayout(2, 1));
		jlblImage = new JLabel(new javax.swing.ImageIcon(("img/lock.png")));
		jpLabels.add(jlblUserName = new JLabel("Username"));
		jpLabels.add(jlblPassword = new JLabel("Password"));

		// JTextField and JPasswordField
		jpTextFields = new JPanel(new GridLayout(2, 1));
		jpTextFields.add(jtfUsername = new JTextField(15));
		jpTextFields.add(jtfPassword = new JPasswordField(15));
		jtfPassword.setEchoChar('*');

		// JButtons
		jpButtons = new JPanel();
		jpButtons.add(jbtOK = new JButton("OK"));
		jpButtons.add(jbtCancel = new JButton("Cancel"));

		// Set up the JFrame
		add(jlblImage, BorderLayout.NORTH);
		add(jpLabels, BorderLayout.WEST);
		add(jpTextFields, BorderLayout.CENTER);
		add(jpButtons, BorderLayout.SOUTH);

		// Add an ANONYMOUS LISTENER CLASS to jbtCancel
		// Dispose on press
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}