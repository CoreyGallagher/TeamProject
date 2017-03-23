package AttendanceSystemGUICode;

public interface AttendanceDao {
	// persistent methods
		public void add();
		public void list();
		public void view();
		public void edit();
		public void delete();
		public void writeRecordsToFile();
		public void readRecordsFromFile();
}
