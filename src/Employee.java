

public class Employee {
	
	public static String firstName; 
	public static String lastName;
	public static int phoneNumber;
	public static String role;
	
public Employee(String firstName, String lastName, int phoneNumber, String role){
		Employee.firstName=firstName;
		Employee.lastName=lastName;
		Employee.phoneNumber=phoneNumber;
		Employee.role=role;
}


 // change all Employee values to String. 
public String toString(){
	String e = "First name: " + firstName
			+ " Last name: " + lastName +
			" Phone number: " + phoneNumber +
			" Role: " + role;
	return e;
}

public static void setName(String a , String b){
	a= firstName;
	b=lastName;
	}

public void changePhoneNumber(int n){
	n=phoneNumber;
	}

public void changeRole(){
	
	}

}
