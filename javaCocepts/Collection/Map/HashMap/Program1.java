

import java.util.*;

class Program1 {
	
	public static void main(String[] args) {

		HashMap <Integer,String> birth = new HashMap<Integer,String>();
		
		birth.put(10,"Suarabh");
		birth.put(18,"Bhuvanesh");
		birth.put(17,"Harshal");
		birth.put(23,"Prajwal");
		birth.put(8,"Gauri");

		System.out.println(birth);


		Set <Map.Entry<Integer,String>> data = birth.entrySet();
		Iterator<Map.Entry<Integer,String>> itr = data.iterator();


		while(itr.hasNext()) {

			Map.Entry entry = itr.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("\n");

		for(Map.Entry<Integer,String> val:data) {

			System.out.println(val.getKey() + ":" + val.getValue());
		}





	}
}
