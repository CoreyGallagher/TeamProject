package attendance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CreateStudentDatabase {
	ASJtable t = new ASJtable();
	
	 final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/";
		final String USER_NAME = "root";
		final String PASSWORD = "password";
	    
	    public void theQuery(String query){
			Connection con = null;
			Statement st = null;
			try{
				java.lang.Class.forName(JDBC_DRIVER);
				System.out.println("STEP 1 COMPLETE - Driver Registered...");
				
				// STEP 2 - Open a connection
				//          Use the DriverManager.getConnection() method to create a Connection object,
				//          which represents a physical connection with the database server.
			    con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			    System.out.println("STEP 2 COMPLETE - Connection obtained...");
			    
			    // STEP 3 - Create Statement object		    
			    Statement stmt = con.createStatement();
			    System.out.println("STEP 3 COMPLETE - Statement object created...");
			    
			    String createDatabase = "CREATE DATABASE IF NOT EXISTS attendance"; 
			    stmt.executeUpdate(createDatabase);
			    System.out.println("STEP 4(a) COMPLETE - Query executed and database created...");

			    // STEP 4(a) - Execute Query (Create a Table)
			    String createTable = "CREATE TABLE IF NOT EXISTS students " +
		                   "(StudentID VARCHAR(9) not NULL, " +
		                   " lastName VARCHAR(25), " + 
		                   " firstName VARCHAR(25), " + 
		                   " course VARCHAR (25), " +
		                   " module VARCHAR (25),"+
		                   " password VARCHAR (25),"+
		                   " PRIMARY KEY ( StudentID ))";
		                   //"foreign key (moduleCode) references MODULE)"; 
			    stmt.executeUpdate("USE attendance");
			    stmt.executeUpdate(createTable);
			    System.out.println("STEP 4(b) COMPLETE - Query executed and table added to database...");
				con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
				st = con.createStatement();
				st.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Query Executed");
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null,  ex.getMessage());
			}
			
			
	    	
		}
	    
	   /* private void jTextFieldLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLNActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_jTextFieldLNActionPerformed

	    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

	       DefaultTableModel model = (DefaultTableModel) jTable_TableAS.getModel();
	       
	       
	       model.addRow(new Object[]{ jTextFieldStudent.getText(), jTextFieldLN.getText(), jTextFieldFN.getText(), jComboBoxCourse.getSelectedItem(), jComboBoxModule.getSelectedItem(), jTextFieldPaswd.getText() });
	    //GEN-LAST:event_jButtonAddActionPerformed

	        	ArrayList<Student> students = new ArrayList<>();
	            Student s1 = new Student(jTextFieldStudent.getText(), jTextFieldLN.getText(), jTextFieldFN.getText(), jTextFieldPaswd.getText()); 
	            students.add(s1);
	            for (Student s : students) {
	                System.out.print(s + "\n");
	            }
	            ArrayList<Module> modules = new ArrayList<>();
	            
	            Module m1 = new Module((String)jComboBoxModule.getSelectedItem(), 0);
	            //m1.setModuleHours();
	            modules.add(m1);
	            for (Module m : modules) {
	            	m.getModuleHours();
	                System.out.print(m + "\n");
	            }
	            
	            ArrayList<Class> courses = new ArrayList<>();
	            Class c1 = new Class((String)jComboBoxCourse.getSelectedItem());
	            courses.add(c1);
	            for (Class c : courses) {
	                System.out.print(c + "\n");
	            }
	        
	    
	    jButton2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				try{
					theQuery("insert into attendance.students(StudentID, lastName, firstName, course, module, password) values ('"+jTextFieldStudent.getText()+"','" +jTextFieldLN.getText()+"','" +jTextFieldFN.getText()+"','" +jComboBoxCourse.getSelectedItem()+"','" +jComboBoxModule.getSelectedItem()+"','" +jTextFieldPaswd.getText()+"')");
				}
				catch (Exception ex){}
			}
		});
	    	
	}	*/

}
