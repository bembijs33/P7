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

//	public static void main(String[] args) {
		// Here we write the "main" code
		
		// creating all skills

	//	Skill skill1 = new Skill("Basic", 1);
	//	Skill skill2 = new Skill("Dialysis", 2);
	//	Skill skill3 = new Skill("Kitchen Morning", 3);
	//	Skill skill4 = new Skill("Kitchen Evening", 4);
	//	Skill skill5 = new Skill("Kitchen Help Morning", 5);
	//	Skill skill6 = new Skill("Kitchen Help Evening", 6);
	//	Skill skill7 = new Skill("AMA Kitchen Morning", 7);
	
		//Adding skills to skillList
	//	skillList.add(skill1);
	//	skillList.add(skill2);
	//	skillList.add(skill3);
	//	skillList.add(skill4);
	//	skillList.add(skill5);
	//	skillList.add(skill6);
	//	skillList.add(skill7);
		
		
		
		
		// creating  Employees objects
	//	Employee e1 = new Employee("Pia", "Larsen", 12362152);
	//	Employee e2 = new Employee("Mona", "Madsen", 22233586);
	//	Employee e3 = new Employee("Helle", "Lundgren", 99998888);	
	//	Employee e4 = new Employee("Malene", "Kofoed", 00456137);
	//	Employee e5 = new Employee("Iben", "Pedersen", 66431782);
	//	Employee e6 = new Employee("Kirsten", "Nielsen", 16563815);	
		
		// adding employees to the array employeeList 
	//	employeeList.add(e1);
	//	employeeList.add(e2);
	//	employeeList.add(e3);
		// changing parameters of employee
	//	e1.changePhoneNumber(11112233);
	//	e1.changeFirstName("Fie");
	//	e1.changeLastName("Johanson");

		
		//Adding skills to employees
	//	e1.AddSkill(skill1);
	//	e1.AddSkill(skill7);
	//	e2.AddSkill(skill1);
	//	e2.AddSkill(skill2);
	//	e2.AddSkill(skill3);
	//	e2.AddSkill(skill4);
	//	e3.AddSkill(skill1);
	//	e3.AddSkill(skill7);
	//	e3.AddSkill(skill1);
	//	e4.AddSkill(skill1);
	//	e4.AddSkill(skill5);
	//	e5.AddSkill(skill2);
	//	e6.AddSkill(skill1);
	//	e6.AddSkill(skill2);
		
		//Creating arrayLists containing required skills for different schedules.
	//	ArrayList<Skill> requiredSkillsSchedule1 = new ArrayList<Skill>();
	//	requiredSkillsSchedule1.add(skill1);
		

	//	ArrayList<Skill> requiredSkillsSchedule2 = new ArrayList<Skill>();
	//	requiredSkillsSchedule2.add(skill3);
	//	requiredSkillsSchedule2.add(skill1);
		
	//	ArrayList<Skill> requiredSkillsSchedule3 = new ArrayList<Skill>();
	//	requiredSkillsSchedule3.add(skill1);
	//	requiredSkillsSchedule3.add(skill7);
		
		
		//Creating cleaning Schedules...
	//	CleaningSchedule schedule7W = createSchedule(01, "7 West", requiredSkillsSchedule1);
	//	CleaningSchedule schedule7KM = createSchedule(02, "7 Kitchen Morning", requiredSkillsSchedule2);
	//	CleaningSchedule scheduleAMA = createSchedule(03, "AMA", requiredSkillsSchedule3);

		//schedule.AddSchedule(schedule7W); WHY DOESN'T THIS WORK?!!! 
		//if you want to add CS to array list it should be like
	//	schedule.add(schedule7W);
	//	schedule.add(scheduleAMA);
	//	schedule.add(schedule7KM);
		
		
		
		//Creating a date  shift
	//	Date start = createDate(2015, 9, 9, 12, 00);
	//	Date end = createDate(2015, 10, 9, 18, 00);
		
		//Creating a shift
	//	Shift shift00001 = new Shift(00001, start, end, schedule7W);	
		
		//Checking whether Employee 1 can have the shift
	//	e1.skillList.contains(schedule7W); //does containAll and contain do the same thing? we replace e1.skillList.containsAll(schedule.skillsRequired);
	
	//	shiftList.add(shift00001);

		//Creating assignments
	//	Assignment a1 = new Assignment("First", null);

		//Adding the assignment to the array list
	//	assignmentList.add(a1);

		// printing out array list... change which list to print out.
		// System.out.print(employeeList);
		// System.out.println(skillList);
		// System.out.println(employeeList);
		//System.out.println(shiftList);
	//	System.exit(0);	
//	}
	
	
	// Method to create new Cleaning schedule
	//public static CleaningSchedule createSchedule(int id, String name, ArrayList<Skill> skills) {
		//CleaningSchedule schedule = new CleaningSchedule(id, name, skills);
		//return schedule;
	//}
	
	//
	public static Date createDate( int day, int month, int year, int hour, int minute) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH/mm");
			try {
				date = sdf.parse(day + "/" + month + "/" + year + "/" + hour + "/" + minute);
			} catch (Exception e){}
			System.err.println("date error ");
			return date;
	}
}