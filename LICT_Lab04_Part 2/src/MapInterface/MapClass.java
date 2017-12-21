
package MapInterface;

import java.util.HashMap;


public class MapClass {
     public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Sadman Kabir Soumik");
        map.put("phone", "01790074323");
        System.out.println(""+map.get("name")+"  "+map.get("phone"));
        
        
    }
    
}
