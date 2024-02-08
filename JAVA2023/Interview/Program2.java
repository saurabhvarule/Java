import java.util.*;

class HashDemo {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();
		hmap.put("Saurabh",22);
		hmap.put("Vedika ",23);
		System.out.println(hmap);

		Set<Map.Entry> data = hmap.entrySet();
		Iterator<Map.Entry> itr = data.iterator();
		while(itr.hasNext()) {

			Map.Entry entry = itr.next();
			System.out.println("Name = " + entry.getValue() + " Age = " + entry.getKey());
		}
	}
}
