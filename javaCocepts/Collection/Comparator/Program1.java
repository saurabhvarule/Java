import java.util.*;

class Students {

	String name;
	int rollNo;
	
	Students(String name,int rollNo) {

		this.name = name;
		this.rollNo = rollNo;

	}
	public String toString() {

		return name+":"+rollNo;
	}
}

/*
class SortByName implements Comparator<Students> {


	public int compare(Students obj1,Students obj2) {

		return obj1.name.compareTo(obj2.name);
	}
}

class SortByRollNo implements Comparator<Students> {

	public int compare(Students obj1,Students obj2) {

		return -(obj1.rollNo - obj2.rollNo);
	}
}

*/
class MyComparator {

	public static void main(String[] args) {

		ArrayList <Students>t = new ArrayList<Students>();
		t.add(new Students("Saurabh",5));
		t.add(new Students("Harshal",3));
		t.add(new Students("Aditi",1));
		t.add(new Students("Bhuvanesh",2));
		t.add(new Students("Prajwal",4));
		t.add(new Students("Prajwal",6));

		System.out.println(t);

	/*	SortByName sbn = new SortByName();
		SortByRollNo sbr = new SortByRollNo();
		
		Collections.sort(t,sbn);
		System.out.println(t);

		Collections.sort(t,sbr);
		System.out.println(t);*/

		Iterator itr = t.iterator();
		
		Comparator <Students> cmp = new Comparator<Students>() {

			public int compare(Students s1,Students s2) {
				
				return s1.name.compareTo(s2.name);

			}
		};

		Collections.sort(t,cmp);
		System.out.println(t);

		Comparator <Students> cmp2 = new Comparator <Students>() {

			public int compare(Students s1,Students s2) {

				return -(s1.rollNo - s2.rollNo);
			}
		};

		Collections.sort(t,cmp2);
		System.out.println(t);


	}
}
