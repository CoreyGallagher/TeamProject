package attendance;

public class DepartmentHead {
	
	String name;
	//private static int NextNumber;
	String DeptHeadID;
	
	//constructor
	public DepartmentHead(String name, String deptHeadID){
		
		this.DeptHeadID = deptHeadID;
	}
	// get head ID
	public String getDeptHeadID() {
		return DeptHeadID;
	}
	
	//set dept head ID
	public void setDeptHeadID(String deptHeadID) {
		DeptHeadID = deptHeadID;
	}


}
