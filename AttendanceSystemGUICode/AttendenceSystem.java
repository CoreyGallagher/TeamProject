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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class AttendenceSystem extends JFrame{

//Instance variables
private JButton jbtStudent, jbtLecturer, jbtDeptHead, picButton;
private JPanel  buttonPanel, picPanel;
private JLabel jlblOne;
private String jtfPassword;
private final String REQUIREDPASSWORD = "password";


public AttendenceSystem(){

//creating buttonPanel
buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
//adding jbtStudent to the buttonPanel 
buttonPanel.add(jbtStudent = new JButton("Student"));
jbtStudent.setMnemonic('s');
jbtStudent.setHorizontalTextPosition(JButton.CENTER);
jbtStudent.setVerticalTextPosition(JButton.BOTTOM);
add(buttonPanel, BorderLayout.SOUTH);

// Event handling
       jbtStudent.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  // Security password for student login
                  jtfPassword=(JOptionPane.showInputDialog(null,"Please enter password","Password", JOptionPane.QUESTION_MESSAGE));
                 //jtfPassword.setEchoChar('*');

                  if(jtfPassword.equals(REQUIREDPASSWORD))
                  {
                  
                                      }
                  else
                  {
                     JOptionPane.showMessageDialog(null, "Wrong Password!","Error", JOptionPane.ERROR_MESSAGE);
                  }
                  
               
               }
               
            });


buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
buttonPanel.add(jbtLecturer = new JButton("Lecturer"));
jbtLecturer.setMnemonic('l');
jbtLecturer.setHorizontalTextPosition(JButton.CENTER);
jbtLecturer.setVerticalTextPosition(JButton.BOTTOM);

// Event handling
      jbtLecturer.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  // Security password for entry to add bonus
                  jtfPassword=(JOptionPane.showInputDialog(null,"Please enter password","Password", JOptionPane.QUESTION_MESSAGE));
                  
                  if(jtfPassword.equals(REQUIREDPASSWORD))
                  {
                  
                                      }
                  else
                  {
                     JOptionPane.showMessageDialog(null, "Wrong Password!","Error", JOptionPane.ERROR_MESSAGE);
                  }
                  
               
               }
               
            });


buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
buttonPanel.add(jbtDeptHead = new JButton("Department Head"));
jbtDeptHead.setMnemonic('d');
jbtDeptHead.setHorizontalTextPosition(JButton.CENTER);
jbtDeptHead.setVerticalTextPosition(JButton.BOTTOM);

// Event handling
      jbtDeptHead.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  // Security password for entry to add bonus
                  jtfPassword=(JOptionPane.showInputDialog(null,"Please enter password","Password", JOptionPane.QUESTION_MESSAGE));
                  
                  if(jtfPassword.equals(REQUIREDPASSWORD))
                  {
                  
                                      }
                  else
                  {
                     JOptionPane.showMessageDialog(null, "Wrong Password!","Error", JOptionPane.ERROR_MESSAGE);
                  }
                  
               
               }
               
            });


   picPanel = new JPanel();
   //set up college photo 
      picButton = new JButton("LYIT", new ImageIcon("Lyit5.jpg"));
      // Center the icon and text and place the text under the icon
      picButton.setHorizontalTextPosition(JButton.CENTER);
      picButton.setVerticalTextPosition(JButton.TOP);
		picButton.setFont(new Font("Helvetica", Font.BOLD, 20));
		picButton.setBackground(Color.LIGHT_GRAY);
		picButton.setMnemonic('L');
      picPanel.add(picButton,BorderLayout.NORTH);
      add(picPanel);


    
}
public static void main (String [] args){
	AttendenceSystem frame = new AttendenceSystem();
   frame.setTitle("Attendance System");
   //frame.pack();
   frame.setSize(800,400);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }
}   
   
   
   
   
   
  
  
  
  
  
  
  

     
    

