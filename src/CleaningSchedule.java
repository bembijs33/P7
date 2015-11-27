import java.util.ArrayList;

public class CleaningSchedule {

	String Name;
	int CsID;
	ArrayList<Skill> skillsRequired = new ArrayList<Skill>();

	
	// TODO: locations??? string from list // You have written both skillsreq
	// and reqskills?

	public CleaningSchedule(int CsID, String name, ArrayList<Skill> requiredSkill) {
		this.CsID = CsID;
		this.Name = name;
		this.skillsRequired = requiredSkill;

		// no idea what to do with this: new CleaningSchedule(001, "Kitchen West
		// 7", skillList.put(Basic, skill1));

	}

	// change cleaning schedule ID
	public int changeID(int x) {
		x = CsID;
		return x;
	}
}
