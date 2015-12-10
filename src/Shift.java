import java.util.ArrayList;
import java.util.Date;

public class Shift {

	int shiftID;
	Date Start;
	Date End;
	CleaningSchedule Schedule;
	ArrayList<Employee> assignedEmpAry = new ArrayList<Employee>();

	public Shift(int id, Date start, Date end, CleaningSchedule schedule) {
		this.shiftID = id;
		this.Start = start;
		this.End = end;
		this.Schedule = schedule;

	}
	
	public String toString(){
		return " " + shiftID+ " From:  "+ Start +"  Till:   " + End +  Schedule ;
	}

	public void setId(int shiftID){
		this.shiftID = shiftID; 
	}
	
	public void setStartDate(Date Start){
	this.Start=Start;}
	public void setEndDate(Date End){
		this.End=End;
	}
	public void setSchedule (CleaningSchedule schedule){
		this.Schedule=schedule;
	}
	
	
	// change ID
	public void changeShiftID(int newID){
		shiftID=newID;
		}
	
	// change start time
	public void changeStartTime (Date newStart){
		Start=newStart;
		}
	
	//Change end time
	public void changeEndTime (Date newEnd){
		End=newEnd;
	}
	

	public void addEmployee(Employee emp) {
		// get schedule ID
		// get schedule skillRequiredAry
		
		
		//emp.empSkillAry.contains(Schedule required skills)
		assignedEmpAry.add(emp);
		
		

	}
}
