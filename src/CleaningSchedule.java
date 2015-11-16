import java.util.ArrayList;

public class CleaningSchedule {

	int CsID;
	ArrayList<Skill> skillsRequired;

	ArrayList CleaningSchedule = new ArrayList();

	{
		CleaningSchedule.add("CleaningSchedule 1");
		CleaningSchedule.add("CleaningSchedule 2");
		CleaningSchedule.add("CleaningSchedule 3");
		CleaningSchedule.add("CleaningSchedule 4");
		CleaningSchedule.add("CleaningSchedule 5");
		CleaningSchedule.add("CleaningSchedule 6");
		CleaningSchedule.add("CleaningSchedule 7");
		CleaningSchedule.add("CleaningSchedule 8");
		CleaningSchedule.add("CleaningSchedule 9");
		CleaningSchedule.add("CleaningSchedule 10");
		CleaningSchedule.add("CleaningSchedule 11");
		CleaningSchedule.add("CleaningSchedule 12");
		CleaningSchedule.add("CleaningSchedule 13");
		CleaningSchedule.add("CleaningSchedule 14");
		CleaningSchedule.add("CleaningSchedule 15");
		CleaningSchedule.add("CleaningSchedule 16");
		CleaningSchedule.add("CleaningSchedule 17");
		CleaningSchedule.add("CleaningSchedule 18");
		CleaningSchedule.add("CleaningSchedule 19");
		CleaningSchedule.add("CleaningSchedule 20");
		CleaningSchedule.add("CleaningSchedule 21");
		CleaningSchedule.add("CleaningSchedule 22");
		CleaningSchedule.add("CleaningSchedule 23");
		CleaningSchedule.add("CleaningSchedule 24");
		CleaningSchedule.add("CleaningSchedule 25");
		CleaningSchedule.add("CleaningSchedule 26");
		CleaningSchedule.add("CleaningSchedule 27");
		CleaningSchedule.add("CleaningSchedule 28");
		CleaningSchedule.add("CleaningSchedule 29");
		CleaningSchedule.add("CleaningSchedule 30");
		CleaningSchedule.add("CleaningSchedule 31");
		CleaningSchedule.add("CleaningSchedule 32");
		CleaningSchedule.add("CleaningSchedule 33");
		CleaningSchedule.add("CleaningSchedule 34");
		CleaningSchedule.add("CleaningSchedule 35");
		CleaningSchedule.add("CleaningSchedule 36");
		CleaningSchedule.add("CleaningSchedule 37");
		CleaningSchedule.add("CleaningSchedule 38");
		CleaningSchedule.add("CleaningSchedule 39");
		CleaningSchedule.add("CleaningSchedule 40");
		CleaningSchedule.add("CleaningSchedule 41");
		CleaningSchedule.add("CleaningSchedule 42");
		CleaningSchedule.add("CleaningSchedule 43");
		CleaningSchedule.add("CleaningSchedule 44");
		CleaningSchedule.add("CleaningSchedule 45");
		CleaningSchedule.add("CleaningSchedule 46");
		CleaningSchedule.add("CleaningSchedule 47");
		CleaningSchedule.add("CleaningSchedule 48");

	}

	// TODO: locations??? string from list // You have written both skillsreq
	// and reqskills?

	public CleaningSchedule(int CsID, String location, ArrayList<Skill> requiredSkill) {
		this.CsID = CsID;

		// no idea what to do with this: new CleaningSchedule(001, "Kitchen West
		// 7", skillList.put(Basic, skill1));

	}

	// change cleaning schedule ID
	public int changeID(int x) {
		x = CsID;
		return x;
	}
}
