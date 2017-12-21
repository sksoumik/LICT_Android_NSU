package association;

public class CarDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c = new Car("BMW", "7 series");
		System.out.println(c.toString());
		
		Car d  = new Driver("BMW", "7 Series", "Mofiz");
		System.out.println(d.toString());
		Driver dx  = new Driver("BMW", "7 Series", "Mofiz");
		dx.setCarModel("Audi A8");
		dx.setCarName("Audi");
		dx.setDriverName("Mofiz");
		
		System.out.println("CarModel  = "+dx.getCarModel()+"CarName  = "+dx.getCarName()+"DriverName = "+
		dx.getDriverName());

	}

}
