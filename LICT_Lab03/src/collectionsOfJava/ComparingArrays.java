package collectionsOfJava;

import java.util.Arrays;
import java.util.Scanner;

public class ComparingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		int  arr1 [] = {10,20,30};
		int  arr2 [] = {100,20,30};
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		

	}

}
