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



public class DatabaseHandler extends javax.swing.JFrame{
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   	final String DB_URL = "jdbc:mysql://attendancesystem.clql55s9fxrz.eu-west-1.rds.amazonaws.com";
   	final String USER_NAME = "cloud1";
   	final String PASSWORD = "211230mg";

       
   	Connection conn=null;
   	Statement stmt = null;
   	ResultSet rs = null;
   	
   	public void connectToDatabase(){
   		try{
   			// STEP 1 - Load the JDBC driver
   			java.lang.Class.forName(JDBC_DRIVER);
   			System.out.println("STEP 1 COMPLETE - Driver Registered...");
   			
   			// STEP 2 - Open a connection
   		    conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
   		    System.out.println("STEP 2 COMPLETE - Connection obtained...");
   		    
   		    // STEP 3 - Create Statement object		    
   		    stmt = conn.createStatement();
   		    System.out.println("STEP 3 COMPLETE - Statement object created...");
   		}catch(ClassNotFoundException e){
   			System.out.println("Could not load driver.\n" + e.getMessage());
   		}
   		catch (SQLException e) {
   			System.out.println("Problem with SQL.\n" + e.getMessage());
   		}	
   		/*finally{
 		   try {
 		       rs.close();
 		       //p.close();
 		       conn.close();
 		   } catch (SQLException e) {
 		        // TODO Auto-generated catch block
 		       e.printStackTrace();
 		    }
 		
        }*/
   		
   	}
   	
   	public void doQuery(String query){
   		//Connection con = null;
   		//Statement st = null;
   		try{
   			java.lang.Class.forName(JDBC_DRIVER);
   			System.out.println("STEP 1 COMPLETE - Driver Registered...");
   			
   			// STEP 1 - Open a connection
   		    conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
   		    System.out.println("STEP 2 COMPLETE - Connection obtained...");
   		    
   		    // STEP 2 - Create Statement object		    
   		    stmt = conn.createStatement();
		    System.out.println("STEP 3 COMPLETE - Statement object created...");
		    
		    
		    System.out.println("STEP 4(a) COMPLETE - Query executed and database found...");

		    //String selectQueryA=query;
		    //stmt.executeUpdate("USE AttendanceSystem");
		    //ResultSet rs = stmt.executeQuery(query);
		    
		   
		    System.out.println("STEP 4(b) COMPLETE - Query executed.");
			
			
			
			//JOptionPane.showMessageDialog(null, "Query Executed");
			 
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,  ex.getMessage());
		}

		
   		
   		
   	}
}
   	
   

   		/*finally{
   			try{
   				rs.close();
   				conn.close();
   				
   			}catch(SQLException e){
   				e.printStackTrace();
   		}
       }*/
   


 
