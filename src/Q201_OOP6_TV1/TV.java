package Q201_OOP6_TV1;

public class TV {

	int channel = 1;				
	int volumeLevel = 1;			
	boolean on = false;
	String brand = "undefined";		

	public TV() {
		this("sony");
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV (String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public String getBrand() {
		return brand;
	}

	public void setChannel(int channel) {
		if (on && channel >= 1 && channel <= 120)
			this.channel = channel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (on && volumeLevel >= 1 && volumeLevel <= 7)
			this.volumeLevel = volumeLevel;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void isOn() {
		if (on == true)
			System.out.println("TV is already ON");
		else
			System.out.println("TV is already OFF");
	}

	public void turnOn() {
		if (on == true)
			System.out.println("TV is already ON");
		else
			on = true;
		
	}

	public void turnOff() {
		if (on == false)
			System.out.println("TV is already OFF");
		else
			on = false;
	}

	public void channelUp() {
		if (on && channel < 120)
			channel++;
		else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
	}

	public void channelDown() {
		if (on && channel > 1)
			channel--;
		else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
	}

	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
		else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}

	public void volumeDown() {
		if (on && volumeLevel > 1)
			volumeLevel--;
		else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}


	public String toString() {
		return "TV [channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + ", brand=" + brand + "]";
	}

}