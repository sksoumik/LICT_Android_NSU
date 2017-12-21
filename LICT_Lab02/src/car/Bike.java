package car;

import lab2.Cat;

public class Bike extends Vehicle{
	
	private int price;
	private String cc;
	
	
	public Bike(String model, int power) {
		super(model, power);
		this.cc     = cc;
		this.price  = price;
		
	}

	public void twoWheler()
	{
		System.out.println("Two wheler");
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCc() {
		return cc;
	}


	public void setCc(String cc) {
		this.cc = cc;
	}



	@Override
	public String toString() {
		return "Bike [price=" + price + ", cc=" + cc + "]";
	}










	
	
	
	
	
	
	
	

}
