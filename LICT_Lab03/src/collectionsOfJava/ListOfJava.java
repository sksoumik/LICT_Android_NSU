package collectionsOfJava;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] str = {"NSU","DU","BUET"};
		
		System.out.println(Arrays.toString(str));
		
		List<String> list  =  Arrays.asList(str);
		System.out.println(list);
		
		

	}

}
