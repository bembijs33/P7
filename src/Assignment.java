
import java.io.Serializable;
import java.text.SimpleDateFormat;
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
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String start = formatter.format(Start);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String end = formatter2.format(End);
		
		return  employee.toStringName() + " " +start + "    " +end + "   Shift ID: "+shift.shiftID;
	}
	public Employee getEmp(){
		return employee;
	}
	


}
