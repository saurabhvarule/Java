//  Methods in SortedSet()

import java.util.*;

class Methods {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		s.add("Hayat");
		s.add("Eda");
		s.add("Hande");
		s.add("Mugdha");
		s.add("Shraddha");

		System.out.println(s);		// [Eda, Hande, Hayat, Mugdha, Shraddha]
		
		//1.subSet(str1,str2);
		System.out.println(s.subSet("Eda","Mugdha"));		// [Eda,Hande,Hayat]

		//2.headSet(str1);

		System.out.println(s.headSet("Mugdha"));		// [Eda,Hande,Hayat]
		
		//3.tailSet(str1);
		System.out.println(s.tailSet("Hayat"));		// [Hayat,Mugdha,Shraddha]
	
		//4.first();
		System.out.println(s.first());		// [Eda]
		
		//5/last()
		System.out.println(s.last());		// [Shraddha]

	}
}
