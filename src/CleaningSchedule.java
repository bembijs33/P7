import java.util.ArrayList;

public class CleaningSchedule {

	String Name;
	int CsID;
	public ArrayList<Skill> skillRequiredAry = new ArrayList<Skill>();

	public CleaningSchedule(int CsID, String name) {
		this.CsID = CsID;
		this.Name = name;
		}
	
	
	public String toString(){
		return " " + CsID
			+ "  " + Name +"           Skills Required: "+ skillRequiredAry; 
			
		}
	public String getName(){
		return Name;
	}
	public int getCsID(){
		return CsID;
	}
	
	
	public void AddSkill(Skill skill) {
	if(!skillRequiredAry.contains(skill)){
		skillRequiredAry.add(skill);
	}
				
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
