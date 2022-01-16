package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car porche = new Car();
		Car ford = new Car();
		
		porche.setModel("carrira");
		System.out.println("Model is :"+porche.getModel());
		 
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());  
		
		
		VipCustomer customer2 = new VipCustomer("Elli",12000);
		System.out.println(customer2.getName());
		System.out.println(customer2.getEmail());
		
		VipCustomer customer3 = new VipCustomer("Alex",22000,"alex@email.com");
		System.out.println(customer3.getName());
		
		
		Wall wall = new Wall(12,13);
		System.out.println(wall.getHeight());
		System.out.println(wall.getArea());
		
		Toyota toyota = new Toyota(36);
		toyota.Steer(45);
		toyota.accelerate(30);
		toyota.accelerate(20);
		
		Circle circle = new Circle(3.75);
		System.out.println("circle radius is :"+circle.getRadius());
		System.out.println("circle Area is :"+circle.getArea());
		
		Cylinder cylinder = new Cylinder(5.55,7.25);
		System.out.println("cylinder radius is "+cylinder.getRadius());
		System.out.println("Cylinder height is "+cylinder.getHeight());
		System.out.println("Cylinder area is "+cylinder.getArea());
		System.out.println("Cylinder volume is "+cylinder.getVolume());
		

	}

}
