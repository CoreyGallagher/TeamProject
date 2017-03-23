package TeamProject.src.AttendanceSystemGUICode;

public class Module {
	
	//variables
	public String ModuleName;
	
	// default constructors
	public Module(){
		
		ModuleName ="N/A";
	}
	//constructor
	public Module(String ModuleName){
		
		this.ModuleName = ModuleName;
	}
	
	//get module name
	public String getModuleName() {
		return ModuleName;
	}

	//set module name
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

}
