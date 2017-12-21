
package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapTest {
    public static void main(String[] args) {
		
	       TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

	      /*Adding elements to TreeMap*/
	      tmap.put(1, "Data 1");
	      tmap.put(23, "Data 2");
	      tmap.put(70, "Data 3");
	      tmap.put(4, "Data 4");
	      tmap.put(2, "Data 5");

	      /* Display content using Iterator*/
	      Set set = tmap.entrySet();
	      Iterator iterator = set.iterator();
              
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	}
    
}
