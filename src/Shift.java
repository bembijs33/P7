import java.util.Date;

public class Shift {

	int shiftID;
	Date Start;
	Date End;
	CleaningSchedule Schedule;

	public Shift(int id, Date start, Date end, CleaningSchedule schedule) {
		this.shiftID = id;
		this.Start = start;
		this.End = end;
		this.Schedule = schedule;

	}
	
	public String toString(){
		return " " + shiftID+ "  "+ Start +"  " + End+ "  Schedule" ;
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
	

	public void getCleaningScheduleID() {

	}

	public void addEmployee() {
		
		

	}
}
