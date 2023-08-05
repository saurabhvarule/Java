import java.util.*;

class FoodCourt implements Comparator<FoodCourt>{

	String itemName;
	double price;
	FoodCourt(String itemName,double price) {
 
		this.itemName = itemName;
		this.price = price;
	}
	
	public String toString() {

		return itemName + ":" + price;
	}
	
	public static void main(String[] args) {

		TreeMap<FoodCourt,Double> sm = new TreeMap<FoodCourt,Double>();

		sm.put(new FoodCourt("Biryani",250.00),8.9);
		sm.put(new FoodCourt("Pasta",350.50),5.5);
		sm.put(new FoodCourt("Tandoori",550.00),10.0);
		sm.put(new FoodCourt("Burger",150.50),7.9);
		
		System.out.println(sm);
		SortByName sbn = new SortByName();
		Collections.sort(sm,sbn);
		
		}
	
	
}

class SortByName implements Comparator <FoodCourt,Double> {

	public int compare(FoodCourt f1,FoodCourt f2) {

		return f1.itemName.compareTo(f2.itemName);
	}
}


