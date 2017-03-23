package TeamProject.src.AttendanceSystemGUICode;
import java.util.Scanner;

public class AttendanceMenu extends AttendanceFileHandler {
	// instance variables
	private int option;
	Scanner keyboardIn = new Scanner(System.in);

	// constructors
	public AttendanceMenu() {
		super();

	}

	// display menu for joint account
	public void displayMenu() {
		System.out.println("Joint Menu");
		System.out.println("1 - Add");
		System.out.println("2 - List");
		System.out.println("3 - View");
		System.out.println("4 - Edit");
		System.out.println("5 - Delete");
		System.out.println("6 - Quit");

	}

	// read option from menu
	@SuppressWarnings("resource")
	public void readOption() {

		Scanner kbInt = new Scanner(System.in);
		System.out.println("\n\tEnter Option [1|2|3|4|5|6]");
		option = kbInt.nextInt();
	}

	// getter
	public int getOption() {
		return option;
	}
}
	

