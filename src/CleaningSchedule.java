import java.util.ArrayList;

public class CleaningSchedule {
	
	int CsID;
	ArrayList<Skill> skillsRequired;
	
	
	//TODO: locations??? string from list
	
	public CleaningSchedule(int CsID, String location, ArrayList<Skill> requiredSkill){
		this.CsID=CsID;
		
		
	}
	
	//change cleaning schedule ID
	public int changeID(int x){
		x=CsID;
		 return x;
	}
}
