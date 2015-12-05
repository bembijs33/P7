import java.util.ArrayList;

public class CleaningSchedule {

	String Name;
	int CsID;
	ArrayList<Skill> skillRequired = new ArrayList<Skill>();

	public CleaningSchedule(int CsID, String name) {
		this.CsID = CsID;
		this.Name = name;
		}
	
	public String toString(){
		return " " + CsID
			+ "  " + Name; 
			
		}
	
	public void AddSkill(Skill skill) {
		skillRequired.add(skill);
		}
	
	//Creating a method that adds cleaning schedules to the schedule arrayList... 
	public void AddSchedule(CleaningSchedule schedule) {
		schedule.AddSchedule(schedule);
	}
	
	
	// change cleaning schedule ID
	public void  changeID(int newID) {
		CsID=newID;
	}
	
	// change cs name
	public void changeCSName(String newName){
		Name=newName;
	}
	
	
}
