import java.io.Serializable;

public class Skill implements Serializable {

	public int skillID;
	public String skillName;

	public Skill(String skillName, int skillID) {
		this.skillName = skillName;
		this.skillID = skillID;

	}

	public String toString() {
		return " " + skillID + " " + skillName;

	}
	public String getName(){
		return skillName;
		
	}
	private int getID() {
		return skillID;
	}
	public void changeName(String newName){
		skillName=newName;
	}
	public void changeID(int newID){
		skillID=newID;
	}
	@Override
	public boolean equals(Object o) {

		if(o instanceof Skill) {
			
			if(this.getID() == ((Skill)o).getID() && this.getName().equals(((Skill)o).getName()))
				return true;
		}
		
		return false;
	}

	
}
