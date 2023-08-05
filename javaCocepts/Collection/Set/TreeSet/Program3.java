
import java.util.*;

class Program3 implements Comparable<Program3> {

	String name = null;
	double sal = 0.0;

	Program3(String name,double sal) {
		System.out.println();
		
		this.name = name;
		this.sal = sal;
	}

	public int compareTo(Program3 obj2) {

		return Double.compare(sal,obj2.sal);

	}
	public String toString() {

		return name + ":" + sal;
	}

	public static void main(String[] args ) {

		TreeSet obj = new TreeSet();
		obj.add(new Program3("Harshal",16.10));
		obj.add(new Program3("Saurabh",9.45));
		obj.add(new Program3("Prajwal",13.12));
		obj.add(new Program3("Aditi",14.3));
		obj.add(new Program3("Bhuvanesh",16.83));
		
		System.out.println(obj);
	}

}
