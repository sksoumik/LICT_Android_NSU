
package VectorTest;

import java.util.Enumeration;
import java.util.Vector;

public class UsingEnumeration {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Sadman Kabir Soumik");
		v.addElement("Azwad Hasan Chowdhury ");
		v.addElement("Syed Irtiza Ahsan");
		// traversing elements using Enumeration
                
                System.out.println("Vectors Elements: "+v);
                System.out.println();
                
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}