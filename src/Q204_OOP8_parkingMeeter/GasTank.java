package Q204_OOP8_parkingMeeter;

public class GasTank {

	double amount = 0;
	double capacity;

	public GasTank(double c) {
		this.capacity = c;
	}

	public void addGas(double a) {
		
		if (amount + a > capacity)
			this.amount = capacity;
		else amount += a;
	}

	public void useGas(double b) {
		if (amount-b < 0)
			this.amount = 0;
		else amount -= b;
	}

	public boolean isEmty() {

		return (amount < 0.1);
	}

	public boolean isFull() {

		return (amount > capacity - 0.1);

	}

	public double getGasLevel() {
		return amount;
	}

	public double fillUp() {
		double amountFill = capacity - amount;
		amount = capacity;
		return amountFill;
	}

}
