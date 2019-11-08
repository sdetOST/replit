package q224;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Tony",4,"Wolf");
		Dog dog2 = new Dog("Tony",5,"Wolf");
		
		System.out.println(dog1);
		System.out.println(dog2.equals(dog1));
		
	}

}
