package teamProject;

public abstract class User {
	
	//instance variables
	protected String Name;
	
	// Constructor 1
	   public User(){
	      this.Name=new String();
	   }
				
		// Constructor 2
	   public User(String name){
			this.Name=name;
		}
				
		// getName() method
		public String getName(){
		   return Name;
		}

		// toString() method
		public String toString(){
		   return Name;
		}
				
		// equals() method
		/*public boolean equals(Person personIn){
		   if(Name.equals(personIn.name))
				return true;
			else
			   return false;
		}*/
	}

	


