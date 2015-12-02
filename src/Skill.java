
public class Skill {

	public int skillID;
	public String skillName;

	public Skill(String skillName, int skillID) {
		this.skillName = skillName;
		this.skillID = skillID;

	}

	public String toString() {
		return " Skill ID: " + skillID + " Skill name: " + skillName;

	}

}
