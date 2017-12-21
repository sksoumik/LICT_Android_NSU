package car;

public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vehicle v  = new Vehicle("Audi A8", 1600);
		
		System.out.println(v.toString());
		
		v.sixWheler();
		
		Bike b = new Bike("Yamaha", 200);
		b.setPrice(1200);
		b.setCc("1200");
		System.out.println(b.getPrice());
		System.out.println(b.getCc());
		
		
		
		
		
		
	

	}

}
