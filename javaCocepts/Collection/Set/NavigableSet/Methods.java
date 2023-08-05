// Methods in NavigableSet();


import java.util.NavigableSet;
import java.util.TreeSet;

class Methods {

	public static void main(String[] args){

		NavigableSet ns = new TreeSet();

		ns.add("Thar");
		ns.add("Vento");
		ns.add("Verna");
		ns.add("Ciaz");
		ns.add("XUV700"); 		//[Ciaz, Thar, Vento, Verna, XUV700]
		System.out.println(ns);

		//1.floor(str1);
		System.out.println(ns.floor("Ciaz"));		// [Ciaz]
		System.out.println(ns.floor("Swift"));		// [Ciaz]
		
		//2.lower(str1);
		System.out.println(ns.ceiling("Swift"));	// [Thar]
		
		//3.higher(str1);
		System.out.println(ns.higher("Ciaz"));		// [Thar]
		
		//4.lower(str1);
		System.out.println(ns.lower("Verna"));		// [Vento]
		
		//5.pollFirst();
		//System.out.println(ns.pollFirst());		// [Ciaz]--->>>removes first data
		
		//6/pollLast();
		//System.out.println(ns.pollLast());		// [XUV700]--->>>removes last data
		
		//7.descendingSet();
		System.out.println(ns.descendingSet());		// [XUV700, Verna, Vento, Thar, Ciaz]
		
		
		//8.subSet();
		System.out.println(ns.subSet("Ciaz",true,"Vento",true));		// [Ciaz,Thar,Vento]
		System.out.println(ns.subSet("Ciaz",false,"Vento",true));		// [Thar,vento]
		
		//9.headSet();
		System.out.println(ns.headSet("Vento",true));		// [Ciaz,Thar,Vento]
		
		//10.tailSet();
		System.out.println(ns.tailSet("Vento",true));		// [[Vento,Verna,XUV700]



	}
}

