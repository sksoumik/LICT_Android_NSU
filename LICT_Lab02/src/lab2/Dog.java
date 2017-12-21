package lab2;

public class Dog implements Animal {
	public void walk()
	{
		System.out.println("A dog can walk");
	}

	@Override
	public void talk() {
		System.out.println("A dog can talk");
		
	}

}
