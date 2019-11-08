package Package01;

import java.util.ArrayList;
import java.util.Arrays;

public class Q174_W2 {

	  public static String lameDb(String db, String op,String id,String data)
	  {
	    
		String returned = "";
		ArrayList<String> dblist = new ArrayList(Arrays.asList(db.split("#")));

		if(op.equals("add")) dblist.add(Integer.parseInt(id) - 1, id + data);
	  	if(op.equals("edit")) dblist.set(Integer.parseInt(id)-1, id+data);
	  	if(op.equals("delete")) dblist.remove(Integer.parseInt(id)-1);

		for (int i = 0; i < dblist.size(); i++) returned += "#" + dblist.get(i);

		return returned.substring(1);
	    
	  }
	   public static void main(String[] args)  {
		    
		     
		     System.out.print(
		       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
		       );
		       
		        System.out.print(
		       lameDb("1tst#2bla#3foo","none","1","")+"\n"
		       );
		     
		   }
		  
		}