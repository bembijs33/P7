import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// This is the class, that will run our program

public class Main {

	// creating arrayLists
	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	static ArrayList<Skill> skillList = new ArrayList<Skill>();
	static ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
	static ArrayList<Shift> shiftList = new ArrayList<Shift>();
	static ArrayList<CleaningSchedule> schedule = new ArrayList<CleaningSchedule>();

	public static void main(String[] ars) {
		// Here we write the "main" code
		
		// creating all skills

		Skill skill1 = new Skill("Basic", 1);
		Skill skill2 = new Skill("Dialysis", 2);
		Skill skill3 = new Skill("Kitchen Morning", 3);
		Skill skill4 = new Skill("Kitchen Evening", 4);
		Skill skill5 = new Skill("Kitchen Help Morning", 5);
		Skill skill6 = new Skill("Kitchen Help Evening", 6);
		Skill skill7 = new Skill("AMA Kitchen Morning", 7);
		skillList.add(skill1);
		
		
		
		
		// creating two Employee objects
		Employee e1 = new Employee("Rob", "Rak", 1236);
		Employee e2 = new Employee("Jak", "Una", 2223);
		Employee e3 = new Employee("Hai", "Luu", 9999);	
		
		e1.AddSkill(skill2);
		
		ArrayList<Skill> requiredSkills = new ArrayList<Skill>();
		requiredSkills.add(skill2);
		requiredSkills.add(skill3);

		CleaningSchedule schedule = createSchedule(1, "something", requiredSkills);
		
		Date start = createDate(2015, 9, 9, 12, 00);
		Date end = createDate(2015, 9, 9, 18, 00);
		Shift shift = new Shift(1, start, end, schedule);	
		

		e1.skillList.containsAll(schedule.skillsRequired);
		
		// adding two employees to the array employeeList 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		// changing parameters of employee
		e1.changePhoneNumber(1111);
		e1.changeFirstName("Little");
		e1.changeLastName("Boy");


		

		// TODO: add skills to the skillList

		Assignment a1 = new Assignment("First", null);

		assignmentList.add(a1);

		// printing out array list... change which list to print out.
		// System.out.print(employeeList);
		// System.out.println(skillList);
		// System.out.println(employeeList);
		System.exit(0);	
	}
	
	public static CleaningSchedule createSchedule(int id, String name, ArrayList<Skill> skills) {
		CleaningSchedule schedule = new CleaningSchedule(id, name, skills);
		return schedule;
	}
	
	public static Date createDate(int year, int month, int day, int hour, int minute) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH/mm");
		
		try {
		date = sdf.parse(day + "/" + month + "/" + year + "/" + hour + "/" + minute);
		} catch (Exception e){}
		
		return date;
	}
}