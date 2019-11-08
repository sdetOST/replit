package q228_MethodsArray_badShipment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean badP(int[] products,int limit)
	  {
	    int count=0;
	    for(int i:products) if( i == 0) count++;
	    	
	    if (count < limit) return true;
	    else return false;
	    
	    
	     
	  }

}
