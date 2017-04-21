package AttendanceSystemGUICode;

/**
 * User Class
 *
 * @author Cloud Grp1
 */
public class User {
	// instance variables
	protected String Name;

	// Constructor 1
	public User() {
		this.Name = new String();
	}

	// Constructor 2
	public User(String name) {
		this.Name = name;
	}

	// getName() method
	public String getName() {
		return Name;
	}

	// toString() method
	public String toString() {
		return Name;
	}
}// end of class
