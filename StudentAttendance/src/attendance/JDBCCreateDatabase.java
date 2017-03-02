// Description: A JDBCCreateDatabase class - Uses JDBC to create a database (student) with one table (students)
//                                         - and insert one record into the table.

package attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateDatabase {
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

			    // STEP 4(a) - Execute Query (Create a Database)
			    String createDatabase = "CREATE DATABASE IF NOT EXISTS attendance"; 
			    stmt.executeUpdate(createDatabase);
			    System.out.println("STEP 4(a) COMPLETE - Query executed and database created...");

			    // STEP 4(b) - Execute Query (Create a Table)
			    String createTable = "CREATE TABLE IF NOT EXISTS students " +
		                   "(StudentID VARCHAR(9) not NULL, " +
		                   "moduleCode VARCHAR(10),"+
		                   " first VARCHAR(25), " + 
		                   " last VARCHAR(25), " + 
		                   " hoursPresent INTEGER, " +
		                   " hoursAbsent INTEGER,"+
		                   " PRIMARY KEY ( StudentID ))";
		                   //"foreign key (moduleCode) references MODULE)"; 

			    stmt.executeUpdate("USE attendance");
			    stmt.executeUpdate(createTable);
			    System.out.println("STEP 4 COMPLETE - Query executed and table added to database...");

			    String student1 = "INSERT INTO students VALUES ('L00113302', 'OOPCP01', 'Bart', 'Simpson', 15, 5) "
		    		   +"ON DUPLICATE KEY UPDATE moduleCode = 'OOPCP01', first='Bart', last='Simpson', hoursPresent=15, hoursAbsent=5";
	        stmt.executeUpdate(student1);
		    String student2 = "INSERT INTO students VALUES ('L00223345', 'OOPCP01', 'Lisa', 'Simpson', 18, 2) "
	    		    	+ "ON DUPLICATE KEY UPDATE moduleCode = 'OOPCP01', first='Lisa', last='Simpson', hoursPresent=18, hoursAbsent=2";
		    stmt.executeUpdate(student2);
		    String student3 = "INSERT INTO students VALUES ('L44556688', 'OOPCP01', 'Homer', 'Simpson', 12, 8) "
	    		    	+ "ON DUPLICATE KEY UPDATE moduleCode = 'OOPCP01', first='Homer', last='Simpson', hoursPresent=12, hoursAbsent=8";
		    stmt.executeUpdate(student3);
		    String student4 = "INSERT INTO students VALUES ('L22334466', 'OOPCP01' 'Marge', 'Simpson', 16, 4) "
	    		     	+ "ON DUPLICATE KEY UPDATE moduleCode = 'OOPCP01', first='Marge', last='Simpson', hoursPresent=16, hoursAbsent=4";
		    stmt.executeUpdate(student4);
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

