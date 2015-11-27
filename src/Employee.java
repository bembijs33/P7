import java.util.ArrayList;

public class Employee {
	public String firstName; 
	public String lastName;
	public int phoneNumber;
	public ArrayList<Skill> skillList = new ArrayList<Skill>();
	//And perhaps working hours allowed?

	public Employee(String firstName, String lastName, int phoneNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		//Should skill be somewhere here?  
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
		return a; 	//Need of return? 
		}

	public String changeLastName(String b){
		lastName=b;
		return b; 	//Need of return?
	}

	public int changePhoneNumber(int x){
		phoneNumber = x;	
		return x; //Need of return?
	}
}
