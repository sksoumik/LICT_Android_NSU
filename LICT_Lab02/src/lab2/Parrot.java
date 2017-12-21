package lab2;

public class Parrot implements Animal, Bird {

	

    @Override
	public void walk() {
		System.out.println("Parrot can also walk");
		
	}

	@Override
	public void talk() {
        
		System.out.println("Parrot can also talk"); 
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Parrot can fly");	 
	}
	
	

}
