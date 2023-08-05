import java.util.*;

class FoodCourt implements Comparable<FoodCourt>{

	String itemName;
	double price;
	FoodCourt(String itemName,double price) {
 
		this.itemName = itemName;
		this.price = price;
	}
	public String toString() {

		return itemName + ":" + price;
	}
	public int compareTo(FoodCourt f1) {

		return itemName.compareTo(f1.itemName);
	}

	public static void main(String[] args) {

		SortedMap<FoodCourt,Double> sm = new TreeMap<FoodCourt,Double>();

		sm.put(new FoodCourt("Biryani",250.00),8.9);
		sm.put(new FoodCourt("Pasta",350.50),5.5);
		sm.put(new FoodCourt("Tandoori",550.00),10.0);
		sm.put(new FoodCourt("Burger",150.50),7.9);
		
		System.out.println(sm);

		Set<Map.Entry<FoodCourt,Double>> s = sm.entrySet();
		Iterator<Map.Entry<FoodCourt,Double>> itr = s.iterator();

		while(itr.hasNext()) {

			Map.Entry data = itr.next();
			System.out.println(data.getKey() + ":" + data.getValue());
		}
	}
	
}


