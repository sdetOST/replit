package Q204_OOP8_parkingMeeter;

public class Main {

	public static void main(String[] args) {
		GasTank g = new GasTank(50.0);
		System.out.println(g.getGasLevel());
		g.addGas(30);
		System.out.println(g.getGasLevel());
		g.useGas(20);
		System.out.println(g.getGasLevel());
		System.out.println(g.isEmty());
		System.out.println(g.isFull());
		System.out.println(g.fillUp());
		System.out.println(g.getGasLevel());
		

	}




	
	

}
