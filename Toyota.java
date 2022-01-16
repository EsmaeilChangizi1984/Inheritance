package Inheritance;

public class Toyota extends Cars {
	
	private int roadService;

	public Toyota(int roadService) {
		super("Toyota", "4WD",5,5,6,false);
		this.roadService = roadService;
	}
	
	public void accelerate(int rate) {
		int newSpeed = getSpeed()+rate;
		if(newSpeed == 0) {
			Stop();
			changeGear(1);
		}else if(newSpeed > 0 && newSpeed <= 10) {
			changeGear(1);
		}else if(newSpeed > 10 && newSpeed <= 20) {
			changeGear(2);
		}else if(newSpeed > 20 && newSpeed <= 30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newSpeed > 0) {
			changeSpeed(newSpeed);
		}
	}
	

}
