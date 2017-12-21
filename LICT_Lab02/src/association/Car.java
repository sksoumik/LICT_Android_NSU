package association;

public class Car {
	
	private String carName;
	private String carModel;
	public Car(String carName, String carModel) {
		
		this.carName = carName;
		this.carModel = carModel;
	}
	
	public Car()
	{
		
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + "]";
	}
	
	
	
	
	

}
