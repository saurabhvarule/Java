

import java.util.*;

class Program1 {

	String name;

	Program1(String name) {

		this.name = name;
	}

	public String toString() {

		return name;
	}
}

class DemoMain {

	public static void main(String[] args) {

		WeakHashMap <Program1,String>hm = new WeakHashMap<Program1,String>();
		
		Program1 p1 = new Program1("Saurabh");
		Program1 p2 = new Program1("Bhuvanesh");
		Program1 p3 = new Program1("Prajwal");
		Program1 p4 = new Program1("Bhushan");
		Program1 p5 = new Program1("Hasrshal");
		
		hm.put(p1,"Isha");
		hm.put(p2,"Gauri");
		hm.put(p3,"Sakshi");
		hm.put(p4,"Kalyani");
		hm.put(p5,"Aditi");
		
		System.out.println(hm);
		
		p1 = null;
		
		System.out.println(hm);
	}
}
