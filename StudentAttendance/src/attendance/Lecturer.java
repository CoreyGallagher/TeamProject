package attendance;

public class Lecturer {
	
	//variables
	
	private String lectID, lectName;
	//private static int nextUniqueNumber;
	
	//constructors
	public Lecturer(String lectID, String lectName){
		this.lectID =lectID;
		this.lectName=lectName;
	}

	public String getLectID() {
		return lectID;
	}

	public void setLectID(String lectID) {
		this.lectID = lectID;
	}

	public String getLectName() {
		return lectName;
	}

	public void setLectName(String lectName) {
		this.lectName = lectName;
	}
	
	
	
}
