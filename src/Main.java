import java.util.ArrayList;

// This is the class, that will run our program


public class Main {
	
	// creating arrayLists
		 static ArrayList<Employee> employeeList = new ArrayList<Employee>();
		 static ArrayList<Skill> skillList = new ArrayList<Skill> ();
	
	
	
	public static void main (String[] ars){
		// Here we write the "main" code
		
		
		
		//creating two Employee objects
		Employee e1 = new Employee("Rob", "Rak", 1236, "full time");
		Employee e2 = new Employee("Jak", "Una", 2223, "Part time");
		Employee e3 = new Employee("Hai", "Luu", 9999, "Part time");
		
		// adding two employees to the array employeeList
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
			
		
		Skill s1= new Skill("first training", 1);
		skillList.add(s1);
		
		
		
		
		
		
		// printing out array list... change which list to print out. 
		System.out.print(skillList);
	
	}
	
}
	

	
	
	
//	public boolean newSkill (Skill newSkill){
//		skillList.add(newSkill);
//		return true;
//	}
	
//	public List<Skill> getSkillList (){ 	
//	}
//	final Main main = new Main();
//	final Skill s1 = new Skill ("KitchenHelp");
//	main.addSkill(s1);
	//Jakob tried to do the same thing with skills as with employee
	// Need to be revised both!!

//		System.exit(0); // Terminates virtual machine
	
	
	
	




