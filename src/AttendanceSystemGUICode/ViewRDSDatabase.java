package AttendanceSystemGUICode;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;


public class ViewRDSDatabase extends javax.swing.JFrame{
	public static void main(String[] args) {
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   	final String DB_URL = "jdbc:mysql://attendancesystem.clql55s9fxrz.eu-west-1.rds.amazonaws.com";
   	final String USER_NAME = "cloud1";
   	final String PASSWORD = "211230mg";
       
   	Connection conn=null;

	try{
		// STEP 1 - Load the JDBC driver
		java.lang.Class.forName(JDBC_DRIVER);
		System.out.println("STEP 1 COMPLETE - Driver Registered...");
		
		// STEP 2 - Open a connection
	    conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	    System.out.println("STEP 2 COMPLETE - Connection obtained...");
	    
	    // STEP 3 - Create Statement object		    
	    Statement stmt = conn.createStatement();
	    System.out.println("STEP 3 COMPLETE - Statement object created...");

	    // STEP 4(a) - Execute Query
	    String selectQueryA="SELECT * FROM AttendanceSystem.Student";
	    stmt.executeUpdate("USE AttendanceSystem");
	    ResultSet rs = stmt.executeQuery(selectQueryA);
        System.out.println("STEP 4(a) COMPLETE - Query executed and data selected from students...");
        
	    // STEP 5(a) - Process results of the Query
	    while(rs.next() != false){
	       // Can get columns by name, or number which starts at 1
	       String StudentNo = rs.getString("StudentNumber");
	       String last = rs.getString("StudentLastName");
	       String first = rs.getString("StudentFirstName");
	       String course = rs.getString("StudCourseCode");
	       System.out.println(StudentNo + " " + last + " " + first + " " + course);
	    }
        System.out.println("STEP 5(a) COMPLETE - Results of Query processed...");
	}
     // STEP 4(b) - Execute Any other Queries
       /* String selectQueryB="SELECT * FROM AttendanceSystem.";
	    stmt.executeUpdate("USE AttendanceSystem");
	    rs = stmt.executeQuery(selectQueryB);
        System.out.println("STEP 4(b) COMPLETE - Query executed and data selected from students...");
        
	    // STEP 5(b) - Process results of the Query
	    while(rs.next() != false){
	       // Can get columns by name, or number which starts at 1
		   String id = rs.getString("id");
	       String age = rs.getString("age");
	       System.out.println(id + " " + age);
	    }
        System.out.println("STEP 5(b) COMPLETE - Results of Query processed...");	        
        	        
	}*/
	catch (ClassNotFoundException e){
		System.out.println("Could not load driver.\n" + e.getMessage());
	}	
	catch (SQLException e) {
		System.out.println("Problem with SQL.\n" + e.getMessage());
	}		
}
}