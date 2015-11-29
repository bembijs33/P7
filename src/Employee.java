import java.util.ArrayList;

public class Employee {
	public String firstName; 
	public String lastName;
	public int phoneNumber;
	public ArrayList<Skill> skillList = new ArrayList<Skill>(); // Instantiating arrayList for skills
	//And perhaps working hours allowed?

	public Employee(String firstName, String lastName, int phoneNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		//Should skill be somewhere here?  
		//Rob: Employee is created without any skill. It is added afterwards in method AddSkill(). 
		}

	public String toString(){
		return "First name: " + firstName
			+ " Last name: " + lastName +
			" Phone number: " + phoneNumber;
		}
	
	// Adding skill to employees skill list
	public void AddSkill(Skill skill) {
		skillList.add(skill);
	}

	//Changing first name
	public void changeFirstName(String newName){
		firstName=newName; 
		}

	//Changing last name
	public void changeLastName(String newLastName){
		lastName=newLastName;
		
	}
	
	//Changing phone number
	public void changePhoneNumber(int newPhoneNumb){
		phoneNumber = newPhoneNumb;	
		
	}
}
