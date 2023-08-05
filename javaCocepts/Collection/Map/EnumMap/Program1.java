import java.util.*;

enum colors {

	red,
	green,
	blue,
	black,
	white;
}

class Demo {

	public static void main(String[] args) {

		EnumMap <colors,Integer>em = new EnumMap<colors,Integer>(colors.class);

		em.put(colors.red,10);
		em.put(colors.green,20);
		em.put(colors.blue,30);
		em.put(colors.black,40);
		em.put(colors.white,50);

		System.out.println(em);

		Set <Map.Entry<colors,Integer>> s = em.entrySet();
		Iterator <Map.Entry<colors,Integer>> itr = s.iterator();

		while(itr.hasNext()){

			Map.Entry val = itr.next();
			System.out.println(val.getKey() + ":" + val.getValue());
		}

		for(Map.Entry<colors,Integer> entry : s){
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
