package q224;

public abstract class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public abstract int getAgeInHumanYears();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
