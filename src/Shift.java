import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.sun.glass.ui.Pixels.Format;

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
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String start = formatter.format(Start);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String end = formatter2.format(End);
		
		
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
		
		// TODO: call method to change data output
		
		
		
		return " " + shiftID+"  "+ Schedule.getName() +"    From:  "+ start + "  Till: "+ end +"    " +emp;
	}


			
			
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
if(o instanceof Shift) {
			
			if((this.getID() == ((Shift)o).getID()) && (this.getStart().equals(((Shift)o).getStart()))&&(this.getEnd().equals(((Shift)o).getEnd())))
				return true;
		}
		
		return false;}
	
	private int getID(){
		return shiftID;
	}
	private Date getStart(){
		return Start;
	}
	private Date getEnd(){
		return End;
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
