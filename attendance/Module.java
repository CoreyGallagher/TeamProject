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
			this.ModuleHours=moduleHours;
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
			if(ModuleName.equalsIgnoreCase("Algorithms & Data Structures"))
			{
				ModuleHours = 20;
			}
			
			if(ModuleName.equalsIgnoreCase("Database Technology"))
			{
				ModuleHours = 25;
			}
			
			if(ModuleName.equalsIgnoreCase("AWS"))
			{
				ModuleHours = 15;
			}
			return ModuleHours;
		}
		
		public void setModuleHours(int moduleHours) {
			this.ModuleHours=moduleHours;
		}
		/*public void setModuleHours() {
			if(ModuleName.equalsIgnoreCase("Algorithms & Data Structures"))
			{
				ModuleHours = 20;
			}
			
			if(ModuleName.equalsIgnoreCase("Database Technology"))
			{
				ModuleHours = 25;
			}
			
			if(ModuleName.equalsIgnoreCase("AWS"))
			{
				ModuleHours = 15;
			}
		}*/
			
		
}
