package AttendanceSystemGUICode;

/**
 * Administrator Adds Student to Module
 * 
 * @Author Cloud Grp1
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ASJstudentToModule {
	// frame and components
	public JFrame frame;
	private JTextField textField;
	@SuppressWarnings({ "rawtypes", "unused" })
	private JComboBox comboBox;

	// create and display frame
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASJstudentToModule window = new ASJstudentToModule();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// constructor
	public ASJstudentToModule() {
		initialize();
	}

	// Initialize the contents of the frame.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 502, 263);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// studentID JTextField
		textField = new JTextField();
		textField.setBounds(269, 81, 118, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// studentId JLabel
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(84, 83, 86, 17);
		frame.getContentPane().add(lblStudentId);
		// modules jCombobox
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "ALGSCP701", "MANGCP701", "DATACP701" }));
		comboBox.setBounds(269, 123, 118, 20);
		frame.getContentPane().add(comboBox);
		// module JLabel
		JLabel lblStudentModule = new JLabel("Module");
		lblStudentModule.setBounds(84, 125, 99, 17);
		frame.getContentPane().add(lblStudentModule);
		// Add to Module JButton
		Button button = new Button("Add To Module");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(159, 176, 151, 38);
		frame.getContentPane().add(button);

		// add action event to add student to module button
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					// connect to database and execute query
					DatabaseHandler dbh = new DatabaseHandler();
					dbh.connectToDatabase();
					dbh.stmt = dbh.conn.createStatement();

					String modQuery = ("insert into AttendanceSystem.StudentModules(StudentIdentity, Module) values ('"
							+ textField.getText() + "','" + comboBox.getSelectedItem() + "')");
					dbh.doQuery(modQuery);
					dbh.stmt.executeUpdate(modQuery);
					JOptionPane.showMessageDialog(null, "Query Executed");
					// close connection
					dbh.rs.close();
					dbh.conn.close();
					// error handling
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
		});
		// add student to module JLabel
		JLabel lblAddStudentTo = new JLabel("Add Student To Module");
		lblAddStudentTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddStudentTo.setBounds(149, 11, 238, 14);
		frame.getContentPane().add(lblAddStudentTo);

	}
}
