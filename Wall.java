package Inheritance;

public class Wall {
	private double width;
	private double height;
	
	public Wall(double width,double height) {
		this.height = height;
		this.width = width;
	}
		
		public void setHeight(double height) {
			this.height = height;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getWidth() {
			return width;
		}
		
		public double getArea() {
			return height*width;
		}
		
	

}
