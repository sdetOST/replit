package q223;

public class EducationalInstitution{
	  private int years;
	  static int duration;
	  

	  
	  public EducationalInstitution(int duration) {
		super();
		this.duration = duration;
	}




	public String graduationRequirements(){
		  String s = String.valueOf(duration)+" years of study";
	
		return s;	     
	  }
	}