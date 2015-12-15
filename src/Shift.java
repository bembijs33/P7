import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Shift implements Serializable {

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
		
		String emp = null; 
		if (assignedEmpAry.isEmpty()){
			emp="No employee assigned";
		}
		else{
			
			for(int i=0;i<assignedEmpAry.size();i++){
				String tempEmp= assignedEmpAry.get(i).toStringName();
				emp=tempEmp;
			}
			
		
		}
		
		return " " + shiftID+"  "+ Schedule.getName() +"    From:  "+ Start+ "  Till: "+ End +"    " +emp;
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
	

	public void assigneEmpToShift(Employee emp) {
		if(!assignedEmpAry.contains(emp)){
			assignedEmpAry.add(emp);
		}
		
		
		

	}
}
