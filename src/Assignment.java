
import java.io.Serializable;
import java.util.Date;

public class Assignment implements Serializable {

	Employee employee;
	Date Start;
	Date End;
	Shift shift;
	public Assignment(Employee employee, Shift shift,Date Start, Date End) {
		this.employee=employee;
		this.Start=Start;
		this.End=End;
		this.shift=shift;
	}
	
	public String toString(){
		return  employee.toStringName() + " " +Start + "    " +End + "   Shift ID: "+shift.shiftID;
	}
	public Employee getEmp(){
		return employee;
	}
	


}
