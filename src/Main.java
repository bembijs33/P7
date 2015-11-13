import java.util.ArrayList;

// This is the class, that will run our program


public class Main {
	
	// creating arrayLists
		 static ArrayList<Employee> employeeList = new ArrayList<Employee>();
		 static ArrayList<Skill> skillList = new ArrayList<Skill> ();
		 static ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
		 static ArrayList<Shift> shiftList = new ArrayList<Shift> ();
	
	
	
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
		//changing parameters of employee
		e1.changePhoneNumber(1111);
		e1.changeRole("Not Working");
		e1.changeFirstName("Little");
		e1.changeLastName("Boy");
			
		//TODO: creating new skill and adding it to skillList
	
		
		
		Assignment a1 =new Assignment("Assignment 1 ", null);
		
		assignmentList.add(a1);
		
		
		// printing out array list... change which list to print out. 
		//System.out.print(employeeList);
		//System.out.println(skillList);
		System.out.println(assignmentList);
	
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
	
	
	
	




