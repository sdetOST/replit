package Assessment_02_03;

import java.util.ArrayList;
import java.util.Arrays;


public class Assesment_02_02 {

	public static void main(String[] args) {
		  ArrayList<String> list =new ArrayList<>(Arrays.asList("z", "y", "x","w", "v"));
		   for (int i = 0; i < list.size(); i++){
		      for (int j = 0; j < list.size(); j++)
		      System.out.println(list.get(i)+list.get(j));		
		    }	
	}

}
