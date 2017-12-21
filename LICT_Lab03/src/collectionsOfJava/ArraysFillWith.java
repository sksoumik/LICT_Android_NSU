package collectionsOfJava;

import java.util.Arrays;

public class ArraysFillWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] ar = {10,5,15,13,20};
		
		Arrays.fill(ar, 10);
		System.out.println(Arrays.toString(ar));
		
		
		//**************************************************
		int [] arr = {2,2,2,2,2,2,2,2,2};
		
		// filling array from index 1 to 4  with 10 
		
		Arrays.fill(arr, 1, 5, 10);
		
		System.out.println(Arrays.toString(arr));
		
		
		//****************************************************
		int  [][] x =  new int [3][4]; // 3 rows, 4 columns 
		
		for (int [] row : x)
		{
			Arrays.fill(row, 15);
		}
		
		System.out.println(Arrays.deepToString(x)); 

	}

}
