package teamProject;

public class Lecturer extends User {
	
	//variables
	private int lecturerNumber;
	private static int nextUniqueNumber;
	
	//constructor 
	public Lecturer(){
		this.lecturerNumber = nextUniqueNumber++;
	}

}
