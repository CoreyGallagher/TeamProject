package AttendanceSystemGUICode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class AttendanceFileHandler implements AttendanceDao {
		private Scanner keyboard = new Scanner(System.in);
		//private ArrayList<Joint> jointAccounts;
		private File file = new File("myStudents.bin");

		// constructors
		public AttendanceFileHandler() {
			//this.jointAccounts = new ArrayList<Joint>();
		}

		// add books to ArrayList
		public void add() {
			//Joint accountToAdd = new Joint();
			//accountToAdd.read();
			//this.jointAccounts.add(accountToAdd);
		}

		// getAccounts from ArrayList
		//public ArrayList<Joint> getAccounts() {
			//return jointAccounts;
		//}

		public void list() {
			//for (Joint j : jointAccounts)
				//System.out.println(j);
		}

		// Write Records to File
		public void writeRecordsToFile() {

			try {
				// Create PrintWriter object outputFile
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));

				//os.writeObject(myStudents);
				// Close textfile.txt
				os.close();
			} catch (IOException e) {
				e.printStackTrace(); // Display exception details
			}
		}

		// Read Records from File
		@SuppressWarnings("unchecked")
		public void readRecordsFromFile() {

			// If the file exists read from it
			if (file.exists()) {

				try {

					// Deserialize the ArrayList
					ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));

					// We read in the data from the file
					//jointAccounts = (ArrayList<Joint>) is.readObject();
					is.close();

				} catch (Exception e) {

					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			} else {

				// If the file doesn't exists create it
				try {
					file.createNewFile();

				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}
		
		// View an account by number
		public void view() {

			// Read the number of the video to be viewed from the 		System.out.println("ENTER NUMBER OF ACCOUNT TO VIEW : ");
			//int accountToView = keyboard.nextInt();

			// for every Video object in videos
			//for (Joint j : jointAccounts) {

				// if it's number equals the number of the account to View
				//if (j.getAccountNo() == accountToView) {

					// display it
					//System.out.print(j);
					//break;
				}

		

		// Delete account by number
		public void delete() {
			// Read the number of the video to be viewed from the user
			System.out.println("ENTER NUMBER OF ACCOUNT TO VIEW : ");
			int accountToView = keyboard.nextInt();

			// for every Video object in videos
			/*for (Joint j : jointAccounts) {

				// if it's number equals the number of the account to View
				if (j.getAccountNo() == accountToView) {

					// display it
					this.jointAccounts.remove(j);
					break;
				}
			}*/
		}

		// Edit account by number
		public void edit() {
			// int accountToView = keyboard.nextInt();
			/*view();
			for (Joint j : jointAccounts) {
				if (j != null) {
					// get it's index
					int index = jointAccounts.indexOf(j);
					// read in a new book and...
					j.read();
					// reset the object in books
					jointAccounts.set(index, j);
					break;
				}
			}/*/

		}

}
