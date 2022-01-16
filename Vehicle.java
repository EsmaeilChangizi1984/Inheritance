package Inheritance;

public class Vehicle {
	
	private String name;
	private String size;
	
	private int speed;
	private int direction;
	
	public Vehicle(String name, String size) {
		super();
		this.name = name;
		this.size = size;
		this.direction = 0;
		this.speed = 0;
	}
	
	public void Steer(int direction) {
		this.direction+= direction;
		System.out.println("Vehicle steering at "+direction+" degree.");
	}
	
	public void Move(int carspeed) {
		speed = carspeed;
		System.out.println("Car moving at "+speed+" speed.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void Stop() {
		this.speed = 0;
	}

	
	
	
	
	

}
