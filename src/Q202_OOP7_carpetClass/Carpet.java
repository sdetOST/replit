package Q202_OOP7_carpetClass;

public class Carpet {

	public double width, length, unitPrice;
	public double totalPrice;
	public boolean isPersian;

	public Carpet() {
		this(300.0, 300.0, 0.0, true);
//		this.width = 300.0;
//		this.length = 300.0;
//		this.unitPrice = 0;
//		this.isPersian = true;
		this.totalPrice = 200;

	}

	public Carpet(double width, double length, double unitPrice, boolean isPersian) {

		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;

		if (isPersian == false)
			this.totalPrice = (this.width + this.length) * this.unitPrice;
		else
			this.totalPrice = (this.width + this.length) * this.unitPrice + 200.0;

	}

}
