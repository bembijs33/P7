import java.util.ArrayList;

import java.util.List;
import java.util.*;

// This is the class, that will run our program


public class Main {
	
	 static List<Employee> employeeList = new ArrayList<Employee>();

	
	
	public static void main (String[] ars){
		// Here we write the "main" code
		
		final Employee e1 = new Employee("Rob", "Rak", 1236, "full time");
		 employeeList.add(1,e1);
		final Employee e2 = new Employee("Jak", "UU", 222, "Part time");
		employeeList.add(2,e2);
	

		//System.out.print(employeeList);
		

	
	private final static List<Skill> skillList = new ArrayList<> ();
	
	public boolean newSkill (Skill newSkill){
		skillList.add(newSkill);
		return true;
	}
	
	public List<Skill> getSkillList (){ 	
	}
	final Main main = new Main();
	final Skill s1 = new Skill ("KitchenHelp");
	main.addSkill(s1);
	//Jakob tried to do the same thing with skills as with employee
	// Need to be revised both!!

		System.exit(0); // Terminates virtual machine
	
	}

	




