package Inheritance;

public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer(){
		this("Esmaeil",25000,"esmail@email.com");
		
	}
	public VipCustomer(String name,double creditLimit) {
		this(name,creditLimit,"secondConstructor");
	}
	
	public VipCustomer(String name,double creditLimit,String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCerditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public void steEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmail() {
		return email;
	}

}
