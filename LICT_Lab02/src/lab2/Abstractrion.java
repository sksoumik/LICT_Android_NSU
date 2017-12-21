package lab2;

public class Abstractrion {

	
	public static void main(String[] args) {
		Animal a  = new Dog();
		a.talk();
		a.walk();
		
		Animal b = new Cat();
		b.talk();
		b.walk();
		
		
	    Parrot c = new Parrot(); 
		c.talk();
		c.walk();
		c.fly();
		
		
		
		
		
		

	}

}
