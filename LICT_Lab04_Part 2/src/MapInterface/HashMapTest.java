
package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in;
		try {
			//in = new Scanner(new File(args[0]));
			in = new Scanner(System.in);
			Map<String, Integer> map = new HashMap<String, Integer>();
		        while (in.hasNext()) {
		        String word = in.next();
		        int freq = (map.get(word) == null) ? 1 : map.get(word) + 1;
		        map.put(word, freq);      // autobox int to Integer and upcast, type-check
		      }
		      System.out.println(map);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	     
	}
    
}
