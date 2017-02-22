package TeamProject;
//package ie.lyit.database;

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
				Class.forName(JDBC_DRIVER);
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
			    String createTable = "CREATE TABLE IF NOT EXISTS attendance " +
		                   "(StudentID VARCHAR(9) not NULL, " +
		                   " first VARCHAR(25), " + 
		                   " last VARCHAR(25), " + 
		                   " hoursPresent INTEGER, " +
		                   " hoursAbsent INTEGER,"+
		                   " PRIMARY KEY ( StudentID ))"; 

			    stmt.executeUpdate("USE attendance");
			    stmt.executeUpdate(createTable);
			    System.out.println("STEP 4 COMPLETE - Query executed and table added to database...");

			    // STEP 4(c) - Execute Query (Insert data into students table)
			    String sql = "INSERT INTO attendance VALUES ('L00112233', 'Bart', 'Simpson', 15, 5) ";
			    		    // + "ON DUPLICATE KEY UPDATE first=L00113302, 'Marge', last='Simpson', hoursPresent=11, hoursAbsent=9";
		        stmt.executeUpdate(sql);
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

