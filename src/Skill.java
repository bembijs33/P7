
public class Skill {

	public int skillID;
	public String skillName;
	
	
	public Skill(String skillName, int skillID){
			this.skillName=skillName;
			this.skillID=skillID;
			
			new Skill("Basic", 1);
			new Skill("Dialysis", 2);
			new Skill("Kitchen Morning", 3);
			new Skill("Kitchen Evening", 4);
			new Skill("Kitchen Help Morning", 5);
			new Skill("Kitchen Help Evening", 6);
			new Skill("AMA Kitchen Morning", 7);
			
			
	}
		
	public String toString(){
			return " Skill ID: " + skillID + " Skill: "+ skillName;	
	
		}
		
}

