import java.util.ArrayList;

public class Employee {
	public String firstName; 
	public String lastName;
	public int phoneNumber;
	public ArrayList<Skill> skillList = new ArrayList<Skill>();

	public Employee(String firstName, String lastName, int phoneNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		}

	public String toString(){
		return "First name: " + firstName
			+ " Last name: " + lastName +
			" Phone number: " + phoneNumber;
		}
	
	public void AddSkill(Skill skill) {
		skillList.add(skill);
	}

	public String changeFirstName(String a){
		firstName=a;
		return a; 	
		}

	public String changeLastName(String b){
		lastName=b;
		return b; 	
	}

	public int changePhoneNumber(int x){
		phoneNumber = x;	
		return x;
	}
}
