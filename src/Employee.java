
public class Employee {
	public String firstName; 
	public String lastName;
	public int phoneNumber;
	public String role;
	
public static void main (String[]args){
	Employee numb1=new Employee("Rob", "Rak", 2311, "wrong");
	Employee numb2=new Employee("NoRob", "Rak", 2311, "wrong");
	System.out.println(numb1);
	System.out.println(numb2);
	numb2.changePhoneNumber(1111);
	}



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


public void setName(){
	
	}

public int changePhoneNumber(int x){
	this.phoneNumber = x;	
	return x;
	
	}

public void changeRole(){
	
	}

}
