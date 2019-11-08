package Assessment_02_03;

public class Accumulator {
	int sum;

	public  Accumulator(int i) {

		this.sum = i;
	}

	public int getSum() {
		return sum;
	}

	public void add(int i) {
		sum += i;
	}

	public void remove(int i) {
		sum -= i;
	}

	@Override
	public String toString() {
		return "Sum is: " + sum;

	}

}
