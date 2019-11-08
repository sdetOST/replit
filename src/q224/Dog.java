package q224;

public class Dog extends Animal {
	  private String breed;
	  private int humanYears;
	  
	   public Dog(String name, int age, String breed){
	    super(name, age);
	    this.breed=breed;
	  }
	  
	  public void setBreed(String breed){
	    this.breed=breed;
	  }
	  
	  public String getBreed(){
	    return breed;
	  }
	  
	  public int getAgeInHumanYears(){
	    if(getAge() <= 2){
	      this.humanYears = getAge()*11;
	    }else{
	      this.humanYears = 22 + ((getAge()-2) * 5);
	    }
	   return humanYears;  
	  }
	  
	  public String toString(){
	    return "Name: "+getName()+"\nBreed: "+breed+
	    		"\nAge in calendar years: "+getAge()+
	    		"\nAge in human years: "+getAgeInHumanYears();
	  }
		
		public boolean equals(Dog dog){
		    return dog.getAge()==this.getAge()
		         &&dog.getName().equals(this.getName())
		         &&dog.breed.equals(this.breed);
		}
		
	}