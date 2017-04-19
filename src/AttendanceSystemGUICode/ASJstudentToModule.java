package AttendanceSystemGUICode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ASJstudentToModule {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public ASJstudentToModule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 502, 263);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(269, 81, 118, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(84, 83, 86, 17);
		frame.getContentPane().add(lblStudentId);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ALGSCP701", "MANGCP701", "DATACP701"}));
		comboBox.setBounds(269, 123, 118, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblStudentModule = new JLabel("Module");
		lblStudentModule.setBounds(84, 125, 99, 17);
		frame.getContentPane().add(lblStudentModule);
		
		Button button = new Button("Add To Module");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(159, 176, 151, 38);
		frame.getContentPane().add(button);
		
		JLabel lblAddStudentTo = new JLabel("Add Student To Module");
		lblAddStudentTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddStudentTo.setBounds(149, 11, 238, 14);
		frame.getContentPane().add(lblAddStudentTo);
	}
}
