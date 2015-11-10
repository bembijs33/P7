import java.util.ArrayList;
import java.util.List;

// This is the class, that will run our program


public class Main {
	
	private final static List<Employee> employeeList = new ArrayList<>();
	
	public boolean addEmployee (Employee newEmployee){
		employeeList.add(newEmployee);
		return true;
	}
	
	
	
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	
	
	public static void main (String[] ars){
		// Here we write the "main" code
		
		final Main main = new Main();
		final Employee e1 = new Employee("Rob", "Rak", 1236, "full time");
		main.addEmployee(e1);
		// need to test setName method
		//employeeList.get(0);
		
		System.out.print(employeeList);
		
	}
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
	

		System.exit(0); // Terminates virtual machine
	}

	




