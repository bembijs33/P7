

public class Employee {
	
	public static String firstName; 
	public static String lastName;
	public static int phoneNumber;
	public static String role;
	
	
	public static void main (String[]args){
		Employee e1 = new Employee("Rob","Rak",123,"full time");
		System.out.println(e1);
		e1.changePhoneNumber(233);
		System.out.println(e1);
	}
	
public Employee(String firstName, String lastName, int phoneNumber, String role){
		Employee.firstName=firstName;
		Employee.lastName=lastName;
		Employee.phoneNumber=phoneNumber;
		Employee.role=role;	
}




 // change to String. 
public String toString(){
	
	return "First name: " + firstName
			+ " Last name: " + lastName +
			" Phone number: " + phoneNumber +
			" Role: " + role;
}

public static void setName(String a , String b){
	a= firstName;
	b=lastName;
	}

public void changePhoneNumber(int p){
	p=phoneNumber;
	}

public void changeRole(){
	
	}

}
