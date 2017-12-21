/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ElementCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		List<String> list = new ArrayList<>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
		list.add("one");
		System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
	}

}