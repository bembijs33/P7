import java.util.ArrayList;


// This is the class, that will run our program


public class Main {
	
	// creating arrayLists
		 static ArrayList<Employee> employeeList = new ArrayList<Employee>();
		 static ArrayList<Skill> skillList = new ArrayList<Skill> ();
		 static ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
		 static ArrayList<Shift> shiftList = new ArrayList<Shift> ();
		 static ArrayList<CleaningSchedule> CleaningSchedule = new ArrayList<CleaningSchedule> ();
		  
	
	
	
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
			
		// creating all skills
	
		Skill skill1 = new Skill("Basic", 1);
		Skill skill2 = new Skill("Dialysis", 2);
		Skill skill3 = new Skill("Kitchen Morning", 3);
		Skill skill4 = new Skill("Kitchen Evening", 4);
		Skill skill5 = new Skill("Kitchen Help Morning", 5);
		Skill skill6 = new Skill("Kitchen Help Evening", 6);
		Skill skill7 = new Skill("AMA Kitchen Morning", 7);
		
		
		//TODO: add skills to the skillList
		//Roberts, add skills to the skillList is already done right??
		
		
		Assignment a1 =new Assignment("First", null);
		
		assignmentList.add(a1);
		
		
		// printing out array list... change which list to print out. 
		//System.out.print(employeeList);
		//System.out.println(skillList);
		//System.out.println(employeeList);
		System.exit(0);
	}
	
}