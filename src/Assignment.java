
import java.util.Date;

public class Assignment {

	Employee employee;
	Date Start;
	Date End;

	public Assignment(Employee employee, Date Start, Date End) {
		this.employee=employee;
		this.Start=Start;
		this.End=End;
	}
	
	public String toString(){
		return " " + employee + " " +Start + " " +End;
	}
	
	//change Start time
	public void changeStarTime(Date newStart){
		Start=newStart;
	}
	
	//change end time
	public void changeEndTime (Date newEnd){
		End=newEnd; 
	}
	
	// TODO: change employee method

}
