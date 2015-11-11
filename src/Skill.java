
public class Skill {

	static int skillID;
	//list of skill ID's 
	static String skillName;
	
	public Skill (int skillID, String skillName){
		Skill.skillID=skillID;
		Skill.skillName=skillName;
	}
	
	public static String addSkill;
	
	public Skill(String addSkill){
			Skill.addSkill=addSkill;
	// Where and how do I add the names of the skill?
	}			
	public String toString(){
			return "addSkill: " + addSkill;
		
			}
	//How do I get this toString thing to work?!
		

}


