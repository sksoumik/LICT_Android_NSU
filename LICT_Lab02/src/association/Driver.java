package association;

public class Driver extends Car {
	
	private String driverName;

	public Driver(String carName, String carModel, String driverName) {
		super(carName, carModel);
		this.driverName = driverName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return  "Driver [driverName=" + driverName + "]";
	}


	
	

}
