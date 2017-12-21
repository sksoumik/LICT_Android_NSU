package lab2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	/**
	 * Set does not contain any duplicate elements 
	 * It can implemented as 
	 */
	public static void main(String[] args) {
		
		Set<String> hash_set   =  new HashSet<String>();
		hash_set.add("NSU");
		hash_set.add("NSU");
		hash_set.add("IUB");
		
		System.out.println(hash_set); // Prints only the unique elements 
		
		
		

	}

}
