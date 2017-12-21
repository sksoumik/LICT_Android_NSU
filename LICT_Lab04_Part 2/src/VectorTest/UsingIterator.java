
package VectorTest;

import java.util.Iterator;
import java.util.Vector;

// Vector is synchronized but List is not synchronized.    
// 

public class UsingIterator {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		Iterator<String> itr = vct.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
    
}
