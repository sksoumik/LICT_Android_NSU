package vectorTest;

import java.util.Vector;

public class CloneVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
                
		System.out.println("Actual vector:"+vct);
		
		
		Vector<String> clonedCopy = (Vector<String>) vct.clone();
		
                clonedCopy.add("Mr Xyz");
                vct.add("Random1");
                
		System.out.println("Cloned vector:"+clonedCopy);
                System.out.println("Actual vector1:"+vct);

	}

}
