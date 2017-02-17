package teamProject;

public class Lecturer extends User {
	
	//variables
	
	private int lecturerNumber;
	private static int nextUniqueNumber;
	
	//constructors
	public Lecturer(){
		this.lecturerNumber = nextUniqueNumber++;
	}
	
public Lecturer(String name){
		
		super (name);
		this.lecturerNumber = nextUniqueNumber;
	}
	
	// get lecturer number
	public int getLecturerNumber() {
		return lecturerNumber;
	}
	
	//set lecturer number
	public void setLecturerNumber(int lecturerNumber) {
		this.lecturerNumber = lecturerNumber;
	}

	
}
