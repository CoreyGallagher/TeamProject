//Description: A JDBCQueryDatabase class - Queries students table in student database,
//                                       - and processes the results.

package attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JDialog;


	public class JDBCQueryDatabase{ //extends SecurityDialog {
		public static void main(String[] args) {
			// JDBC Driver name and database URL
			final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://localhost/";
			final String USER_NAME = "root";
			final String PASSWORD = "password";
			String sid=" ";
			Connection conn=null;
			//SecurityDialog dialog = new SecurityDialog();

			/*dialog.setTitle("Add Bonus Security Screen");
			dialog.pack();	
			// Add the DISPOSE_ON_CLOSE operation to dialog
	      dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);*/
			
			
			
			try{
				
				// STEP 1 - Load the JDBC driver
				//          Initialize a driver to open a communications channel with the database.
				java.lang.Class.forName(JDBC_DRIVER);
				System.out.println("STEP 1 COMPLETE - Driver Registered...");
				
				// STEP 2 - Open a connection
				//          Use the DriverManager.getConnection() method to create a Connection object,
				//          which represents a physical connection with the database server.
			    conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			    System.out.println("STEP 2 COMPLETE - Connection obtained...");
			    Scanner kbString = new Scanner(System.in);
			    // STEP 3 - Create Statement object		    
			    Statement stmt = conn.createStatement();
			    System.out.println("STEP 3 COMPLETE - Statement object created...");
			   System.out.println("Enter student ID:");
			    sid = kbString.nextLine();
			    
			    // STEP 4(a) - Execute Query
			    String selectQuery=("SELECT * FROM students WHERE StudentID='"+sid+"'");
			    stmt.executeUpdate("USE students");
			    ResultSet rs = stmt.executeQuery(selectQuery);
		        System.out.println("STEP 4(a) COMPLETE - Query executed and data selected from students...");
		        
			    // STEP 5(a) - Process results of the Query
			    while(rs.next() != false){
			       // Can get columns by name, or number which starts at 1
			       String first = rs.getString("first");
			       String last = rs.getString("last");
			       String hoursPresent = rs.getString("hoursPresent");
			       String hoursAbsent = rs.getString("hoursAbsent");
			       System.out.println(first + " " + last + " " + hoursPresent +" " +hoursAbsent);
			    }
		        System.out.println("STEP 5(a) COMPLETE - Results of Query processed...");
		        kbString.close();
			}
			catch (ClassNotFoundException e){
				System.out.println("Could not load driver.\n" + e.getMessage());
			}	
			catch (SQLException e) {
				System.out.println("Problem with SQL.\n" + e.getMessage());
			}		
		}
	}

