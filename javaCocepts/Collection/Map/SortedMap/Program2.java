

import java.util.*;

class FoodCourt {

	String itemName;
	double price;

	FoodCourt (String itemName,double price) {

		this.itemName = itemName;
		this.price = price;
		
	}

	public String toString() {

		return itemName + ":" + price;
	}
}

class Program1 {

	public static void main(String[] args) {

		SortedMap <FoodCourt>sm = new TreeMap();
		
		FoodCourt f1 = new FoodCourt("Tandoori",350.00);
		FoodCourt f2 = new FoodCourt("Alpham",150.50);
		FoodCourt f3 = new FoodCourt("Biryani",180.00);
		FoodCourt f4 = new FoodCourt("Chicken Shawrma",120.50);
		FoodCourt f5 = new FoodCourt("Chicken Momos",160.00);

		sm.put(f1);
		sm.put(f2);
		sm.put(f3);
		sm.put(f4);
		sm.put(f5);

		System.out.println(sm);



	}


}
