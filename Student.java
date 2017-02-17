package teamProject;


public class Student extends User {
	
	//instance variables
	
	private int StudentID;
	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	private static int nextNumber;
	
	//constructor
	public Student(String Name){
		
		super(Name);
		StudentID = nextNumber;
	}

}
