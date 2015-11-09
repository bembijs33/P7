import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
	
	public String firstName; 
	public String lastName;
	public String phoneNumber;
	public String role;
	
public Employee(String firstName, String lastName, String string, String role){
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=string;
		this.role=role;
}

public void ArrayList(){
	ArrayList<Employee> emps = new ArrayList<Employee>();
emps.add(new Employee(firstName, lastName, phoneNumber, role));
}


public void setName(){
	
	}

public void changePhoneNumber(){
	
	}

public void changeRole(){
	
	}


public static void main (String[]args){
	new Employee ("as","it","was","working"); 
	System.out.println(ArrayList(emps));
	
	
	}
}
