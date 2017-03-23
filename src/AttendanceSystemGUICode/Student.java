package TeamProject.src.AttendanceSystemGUICode;


public class Student  {
	
	//instance variables
	String firstName , lastName, password, course;
	//Module module;
	//Class class;
	int StudentID = 11001122;
	
	//constructor
	public Student(String firstName, String lastName, String password){
		
		
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		StudentID ++;
	}
	// returns the students first name
	public String getfirstName() {
		return firstName;
	}

	// sets the students first name
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	// return the students ID
	public int getStudentID() {
		return StudentID;
	}

	// Set the students ID
	//public void setStudentID(int studentID) {
	//	StudentID = studentID;
	//}
	
	//returns the studens last name
	public String getLastName() {
		return lastName;
	}
	
	//sets the students last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// return password
	public String getPassword() {
		return password;
	}
	
	// set password
	public void setPassword(String password) {
		this.password = password;
	}
	// toString() method
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", StudentID=" + StudentID + "]";
	}
	
	
	
	
	

}
