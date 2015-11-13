
public class Employee {
	public String firstName; 
	public String lastName;
	public int phoneNumber;
	public String role;

public Employee(String firstName, String lastName, int phoneNumber, String role){
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.role=role;
}

public String toString(){
		return "First name: " + firstName
			+ " Last name: " + lastName +
			" Phone number: " + phoneNumber +
			" Role: " + role;
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

public String changeRole(String y){
	role=y;
	return y;
	}

}
