
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment implements Serializable {

	Employee employee;
	Shift shift;
	
	
	public Assignment(Employee employee, Shift shift) {
		this.employee=employee;
		this.shift=shift;
	}
	
	public String toString(){
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String start = formatter.format(shift.Start);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String end = formatter2.format(shift.End);
		
		return  employee.toStringName() + " " +start + "    " +end + "   Shift ID: "+shift.shiftID;
	}
	public Employee getEmp(){
		return employee;
	}
	public Date getStart(){
		return shift.Start;
	}
	public Date getEnd(){
		return shift.End;
	}


}
