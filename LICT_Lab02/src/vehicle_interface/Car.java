package vehicle_interface;

public class Car implements Vehicle {
	
	private String model;
	private int price;
	
	

	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public void twoWheler() {
		System.out.println("It is two wheeler");
		
	}

	@Override
	public void threeWheler() {
		System.out.println("It is three wheeler");
		
	}

	@Override
	public void fourWheler() {
		System.out.println("It is four wheeler");
		
	}

	@Override
	public void sixWheler() {
		System.out.println("It is six wheeler");
		
	}
	
	
	

}
