
import java.io.Serializable;
import java.util.Date;

public class Assignment implements Serializable {

	Employee employee;
	Date Start;
	Date End;

	public Assignment(Employee employee, Date Start, Date End) {
		this.employee=employee;
		this.Start=Start;
		this.End=End;
	}
	
	public String toString(){
		return  employee.toStringName() + " " +Start + "    " +End;
	}
	


}
