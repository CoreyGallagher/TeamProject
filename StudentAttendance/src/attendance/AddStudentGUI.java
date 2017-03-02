package attendance;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class AddStudentGUI extends JFrame{
	 public static void main(String[] args){
		   AddStudentGUI frame = new AddStudentGUI();
		   frame.setTitle("Add Student");
		   frame.pack();
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setLocationRelativeTo(null);
		   frame.setVisible(true);
	 }
	   private JPanel jpan1;
	   private JPanel jpan2;
	   private JLabel jlbFName, jlbLName, jlbID, jlbPw, jlbCourse, jlbMod;
	   private JTextField jtfFName, jtfLName, jtfID, jtfPw, jtfCourse, jtfMod;
	
	   private JButton jbAdd, jbFinish;
	   ArrayList<Student> students = new ArrayList<>();

	   
	   
	   public AddStudentGUI()
	   {
	   jpan1 = new JPanel();
	   jpan1.setLayout (new GridLayout (6, 2));
	   jpan1.add(jlbFName = new JLabel("First Name:"));
	   jpan1.add(jtfFName = new JTextField(""));
	   jtfFName.setColumns(10);
	   
	   jpan1.add(jlbLName = new JLabel("Last Name:"));
	   jpan1.add(jtfLName = new JTextField(""));
	   jtfLName.setColumns(10);
	   
	   jpan1.add(jlbID = new JLabel("Student ID:"));
	   jpan1.add(jtfID = new JTextField(""));
	   jtfID.setColumns(10);
	   
	   jpan1.add(jlbPw = new JLabel("Password:"));
	   jpan1.add(jtfPw = new JTextField(""));
	   jtfPw.setColumns(10);
	     

	   add(jpan1, BorderLayout.NORTH);

	   jpan2 = new JPanel();
	   jpan2.add(jbAdd = new JButton("ADD"));
	   jpan2.add(jbFinish = new JButton("FINISH"));
	   add(jpan2);
	   
	   jbAdd.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	  
        	   String fName =jtfFName.getText();
        	   String lName =jtfLName.getText();
        	   String studentID =jtfID.getText();
        	   String password =jtfPw.getText();
        	
        	   Student s1 = new Student(fName, lName, password, studentID); 
        	   students.add(s1);
        	   for (Student s : students) {
                   System.out.print(s + "\n");
               }
	   }
	   });
	   
       }
	   }

	   
	  /* ListenerClass listener = new ListenerClass();
	    jbAdd.addActionListener(listener);
	    jbAdd.addActionListener(listener);*/

	   
	   
	  /* private class ListenerClass implements ActionListener
	   {
	   public void actionPerformed(ActionEvent e)
	   {
	   String fName =String.valueOf(jtfFName.getText());
	   String lName =String.valueOf(jtfLName.getText());
	   String studentID =String.valueOf(jtfID.getText());
	   String password =String.valueOf(jtfPw.getText());
	   String course =String.valueOf(jtfCourse.getText());
	   String module =String.valueOf(jtfMod.getText());

	   } */
