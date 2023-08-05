
import java.util.*;

class Program2 implements Comparable<Program2>{

	String name = null;
	double sal = 0.0;

	Program2(String name,double sal) {
	
		this.name = name;
		this.sal = sal;
	}

	public int compareTo(Program obj2){

		return name.compareTo(obj2.name);
	}

	public String toString() {

		return name + ":" + sal;
	}

	public static void main(String[] args ) {

		TreeSet obj = new TreeSet();
		obj.add(new Program2("Harshal",16.10));
		obj.add(new Program2("Saurabh",9.45));
		obj.add(new Program2("Prajwal",13.12));
		obj.add(new Program2("Aditi",14.3));
		obj.add(new Program2("Bhuvanesh",16.83));
		
		System.out.println(obj);
	}

}
