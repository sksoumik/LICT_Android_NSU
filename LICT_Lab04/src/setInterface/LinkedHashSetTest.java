package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "Java");
		Book book1Dup = new Book(1, "Java"); // same id as above
		Book book2 = new Book(2, "Android");
		Book book3 = new Book(3, "Spring");
		
		Set<Book> set1  = new HashSet<Book>();
		set1.add(book1);
		set1.add(book1Dup); // duplicate id, not added
		set1.add(book1); // added twice, not added
		set1.add(book3);
		set1.add(null); // Set can contain a null
		set1.add(null); // but no duplicate
		set1.add(book2);
		
		System.out.println("All Set - "+set1); 
		set1.remove(book1);
		set1.remove(book3);
		System.out.println("After Removing book 1 and 3 - "+set1);
		
		Set<Book> set2 = new LinkedHashSet<>();
		
		set2.add(book1);
		set2.add(book2);
		set2.add(book3);
		
		System.out.println("After the LinkedhashSet Implementation"+set2);
		
		
		
		
		

	}

}
