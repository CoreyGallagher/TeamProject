// Description: A JDBCCreateModuleTable class - Uses JDBC to create a table called module, insert
//                                            - records into the table, and query the table.

package attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Class;


public class JDBCCreateModuleTable{

	public static void main(String[] args) {
		// JDBC Driver name and database URL
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/";
		final String USER_NAME = "root";
		final String PASSWORD = "password";

		Connection conn=null;
		
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
		    
		    // STEP 3 - Create Statement object		    
		    Statement stmt = conn.createStatement();
		    System.out.println("STEP 3 COMPLETE - Statement object created...");
		    
		    String createDatabase = "CREATE DATABASE IF NOT EXISTS attendance"; 
		    stmt.executeUpdate(createDatabase);
		    System.out.println("STEP 4(a) COMPLETE - Query executed and database created...");

		    // STEP 4(a) - Execute Query (Create a Table)
		    String createTable = "CREATE TABLE IF NOT EXISTS module " +
	                   "(moduleCode VARCHAR(10) not NULL, " +
	                   " name VARCHAR(255), " + 
	                   " course VARCHAR(255), " + 
	                   " credits INTEGER, " + 
	                   " hours INTEGER," +
	                   " PRIMARY KEY ( moduleCode ))"; 

		    stmt.executeUpdate("USE attendance");
		    stmt.executeUpdate(createTable);
		    System.out.println("STEP 4(b) COMPLETE - Query executed and table added to database...");

		    // STEP 4(c) - Execute Query (Insert data into modules table)
		    String module1 = "INSERT INTO module VALUES ('OOPCP01', 'Object Oriented Programming', 'Computing', 10, 20) "
		    		     + "ON DUPLICATE KEY UPDATE name='Object Oriented Programming', course='Computing', credits=10, hours=20";
	        stmt.executeUpdate(module1);
		    String module2 = "INSERT INTO module VALUES ('OOGUICP02', 'Object Oriented GUI Programming', 'Computing', 5, 20) "
	    		     + "ON DUPLICATE KEY UPDATE name='Object Oriented GUI Programming', course='Computing', credits=5, hours=20";
		    stmt.executeUpdate(module2);
		    String module3 = "INSERT INTO module VALUES ('SWIMCP03', 'Software Implementation', 'Computing', 5, 20) "
	    		     + "ON DUPLICATE KEY UPDATE name='Software Implementation', course='Computing', credits=5, hours=20";
		    stmt.executeUpdate(module3);
	        System.out.println("STEP 4(c) COMPLETE - Query executed and data added to table..."); 
		}
		catch (ClassNotFoundException e){
			System.out.println("Could not load driver.\n" + e.getMessage());
		}
		catch (SQLException e) {
			System.out.println("Problem with SQL.\n" + e.getMessage());
		}
		finally{
			try{
				conn.close();
			    System.out.println("STEP 6 COMPLETE - Connection closed.");				
			}
			catch (SQLException e){
				System.out.println("Could not close connection.\n" + e.getMessage());
			}
		}
	}
	
}
