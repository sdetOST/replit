package Q204_OOP8_parkingMeeter;

public class GasTank02 {

	double amount = 0;
	double capacity;

	public GasTank02(double x) {
		this.capacity = x;
	}

	public void addGas(double increasedBy) {
		if (increasedBy > capacity) {
			this.amount = capacity;
		} else {
			amount += increasedBy;
		}
	}

	public void useGas(double decreasedBy) {
		if (amount - decreasedBy < 0) {
			amount = 0;
		} else {
			amount -= decreasedBy;
		}
	}

	public boolean isFull() {
		return (amount > capacity - 0.1);

	}

	public boolean isEmpty() {
		return (amount < 0.1);

	}

	public double getGasLevel() {
		return amount;
	}

	public double fillUp() {
		return capacity - amount;
	}

}
