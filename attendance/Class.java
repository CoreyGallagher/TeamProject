package attendance;

public class Class {
	@Override
	public String toString() {
		return "Class [className=" + className + "]";
	}

		//variables
		public String className;

		//constructors
		public Class(){
			
			className = "N/A";
			}
		
		public Class(String className){
			
			this.className = className;
		}
		
		//getters and setters
		
		//get class name
		public String getClassName() {
			return className;
		}

		//set class name
		public void setClassName(String className) {
			this.className = className;
		}
		
		
		
		
}
