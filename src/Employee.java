import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable{
	
	public  String firstName; 
	public String lastName;
	public int phoneNumber;
	public ArrayList<Skill> empSkillAry = new ArrayList<Skill>(); // Instantiating arrayList for Employee skills


	public Employee(String firstName, String lastName, int phoneNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		}

	public String getSkillName( int x){
		return empSkillAry.get(x).skillName;
	}
	public String toString(){
		return " " + firstName
			+ "      " + lastName + "       Phone:   " + phoneNumber + "    Skill   " + empSkillAry.toString();
			
		}
	public String toStringName(){
		return " " +firstName + "    " +lastName;
	}
	// Adding skill to employees skill list
	public void AddSkill(Skill skill) {
			// checking if skill list contains the same skill
		if(!empSkillAry.contains(skill)){
			empSkillAry.add(skill);
		}
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