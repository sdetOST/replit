package Q195_OOP3_getterSetter;

class Db {
	  
	  private String data;
	  private int yint;
	  
	  public void insertData(String data, int yint) {

			this.data = data;
			this.yint = yint;

	  }
	  
	  public void setData(){
	    this.data = data;
	  }
	  public void setYint(){
	    this.yint = yint;
	  }
	  public String getData(){
	     return data;
	  }
	  public int getYint(){
	     return yint;
	  }
	  
	  
	  
	}