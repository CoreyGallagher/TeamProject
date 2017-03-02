package attendance;

public class Module {
	//variables
		public String ModuleName;
		public int ModuleHours;
		
		// default constructors
		public Module(){
			
			ModuleName ="N/A";
			ModuleHours=0;
		}
		//constructor
		public Module(String moduleName, int moduleHours){
			
			this.ModuleName = moduleName;
			if(ModuleName.equalsIgnoreCase("Cloud & Green IT"))
			{
			this.ModuleHours = 20;
			}
		}
		
		//get module name
		public String getModuleName() {
			return ModuleName;
		}

		//set module name
		public void setModuleName(String moduleName) {
			ModuleName = moduleName;
		}
		@Override
		public String toString() {
			return "Module [ModuleName=" + ModuleName + ", ModuleHours=" + ModuleHours + "]";
		}
		public int getModuleHours() {
			return ModuleHours;
		}
		public void setModuleHours(int moduleHours) {
			if(ModuleName.equalsIgnoreCase("Cloud & Green IT"))
			{
			this.ModuleHours = 20;
			}
		}
		
		
		
		
}
