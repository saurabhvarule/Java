// --->>>IdentityHashCode to store data on a single key value 

import java.util.*;

class Progra1 {

	public static void main(String[] args) {

		IdentityHashMap <Integer,String> im = new IdentityHashMap<Integer,String>();

		im.put(new Integer(10),"Saurabh");
		im.put(new Integer(10),"Prajwal");
		im.put(new Integer(13),"Ankit");
		im.put(new Integer(11),"Rutuja");
		im.put(new Integer(12),"Ganu");
		im.put(new Integer(10),"Tanmay");
		im.put(new Integer(11),"Bhushan");
		im.put(new Integer(10),"Isha");
		im.put(new Integer(11),"Tanmay");
		im.put(new Integer(17),"Harshal");
		im.put(new Integer(18),"Bhuvanesh");
		im.put(new Integer(18),"Gauri");

		System.out.println(im);

		Set <Map.Entry<Integer,String>> data = im.entrySet();
		Iterator <Map.Entry<Integer,String>> itr = data.iterator();

		while(itr.hasNext()){

			Map.Entry entry = itr.next();

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		/*for(Map.Entry<Integer,String> val: data) {

			System.out.println(val.getKey() + ":" + val.getValue());

		}*/
	}
}
