package Inheritance;

public class Cars extends Vehicle{
	
	private int doors;
	private int wheels;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Cars(String name, String size, int doors, int wheels, int gears, boolean isManual) {
		super(name, size);
		this.doors = doors;
		this.wheels = wheels;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}


	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car changed to gear number "+this.currentGear);
	}
	
	public void changeSpeed(int speed) {
		Move(speed);
		System.out.println("Changed the speed with "+speed);
	}
	
	
	
	

}
