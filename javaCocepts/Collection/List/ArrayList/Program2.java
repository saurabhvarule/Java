

import java.util.*;

class Program1{

	public static void main(String[] args){

		LinkedList al = new LinkedList();
		al.add('S');
		al.add('A');
		al.add('U');
		al.add('R');
		al.add('A');
		al.add('B');
		al.add('H');

		ListIterator li = al.listIterator();

		while(li.hasNext())
			System.out.println(li.next());



	}
}
