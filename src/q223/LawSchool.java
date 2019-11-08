package q223;

public class LawSchool extends EducationalInstitution{
	

	public LawSchool() {
		super(duration);
		duration = 3;
	}

	@Override
	public String graduationRequirements(){
			
		return "3 years of study and passing the bar";
	     
	  }

}
