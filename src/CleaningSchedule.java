import java.util.ArrayList;

public class CleaningSchedule {

	String Name;
	int CsID;
	ArrayList<Skill> skillRequired = new ArrayList<Skill>();

	//public CleaningSchedule(int CsID, String name, ArrayList<Skill> requiredSkill) {
		//this.CsID = CsID;
		//this.Name = name;
		//this.skillRequired = requiredSkill;
		//}


	public CleaningSchedule(int CsID, String name) {
		this.CsID = CsID;
		this.Name = name;
		}
	
	public String toString(){
		return "ID: " + CsID
			+ " CS : " + Name + " Skill: " + skillRequired; 
			
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
		newID = CsID;
	}
	
}
