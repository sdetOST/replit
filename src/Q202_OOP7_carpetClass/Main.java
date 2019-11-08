package Q202_OOP7_carpetClass;

public class Main {

	public static void main(String[] args) {
		Carpet c = new Carpet();
		System.out.println(c.totalPrice); // 200


		Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
		System.out.println(c2.totalPrice); // 80   
//		the calculation:(20+20)*2


		Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
		System.out.println(c3.totalPrice); // 280   
	}

}
