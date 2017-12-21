package car;

public class Vehicle {
	private String model;
	private int power;
	
	
	public Vehicle(String model, int power)
	{
		this.model   = model;
		this.power   = power;
		
	}
	
	public void fourWheler()
	{
		System.out.println("four wheler");
	}
	
	public void threeWheler()
	{
		System.out.println("three wheler");
	}
	public void sixWheler()
	{
		System.out.println("six wheler");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", power=" + power + "]";
	}
	
	

}
