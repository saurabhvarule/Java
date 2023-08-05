import java.io.*;
import java.util.*;

class IteratorDemo{

	public static void main(String[] args){

		Vector v = new Vector();
		v.add("Saurabh");
		v.add("Harshal");
		v.add("Bhuvanesh");
		v.add("Prajwal");
		v.add("Yash");

		System.out.println(v);

		Enumeration obj = v.elements();
		while(obj.hasMoreElements()){

			System.out.println(obj.nextElement());
		}
	}
}
