package AttendanceSystemGUICode;

/**
 * Department Head Class
 *
 * @author Cloud Grp1
 */

public class DepartmentHead extends User {

	private static int NextNumber;
	private int DeptHeadID;

	// constructor
	public DepartmentHead(String name) {

		super(name);
		DeptHeadID = NextNumber;
	}

	// get head ID
	public int getDeptHeadID() {
		return DeptHeadID;
	}

	// set dept head ID
	public void setDeptHeadID(int deptHeadID) {
		DeptHeadID = deptHeadID;
	}

}
