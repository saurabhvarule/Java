import java.util.*;

class ForeachDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add("Yash");
		al.add("Prajwal");
		al.add("Harshal");
		al.add("Bhuvanesh");
		al.add("Saurabh");

		for(Object Data:al){

			System.out.println(Data);
		}
	}

}
