import java.util.*;

class Program1 {

	public static void main(String[] args) {

		Map <Integer,String>lm  = new LinkedHashMap<Integer,String>();
		lm.put(10,"Saurabh");
		lm.put(15,"Prajwal");
		lm.put(17,"Harshal");
		lm.put(18,"Bhuvi");
		lm.put(5,"Gauri");
		lm.put(5,"Aditi");	// --->>> It replaces value when same key arives;

		System.out.println(lm);
	}
}
