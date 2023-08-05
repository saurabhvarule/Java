import java.util.*;

class UniPuneExam {
	
	int date;
	String subject;

	UniPuneExam(int date,String subject) {

		this.date = date;
		this.subject = subject;
	}

	public String toString(){

		return date + ":" + subject;
	}

	public static void main(String[] args) {

		LinkedList <UniPuneExam> al = new LinkedList<UniPuneExam>();
		al.add(new UniPuneExam(29,"DSBDA"));
		al.add(new UniPuneExam(2,"WT"));
		al.add(new UniPuneExam(5,"Ai"));
		al.add(new UniPuneExam(9,"IS"));
		
		System.out.println(al);

		Comparator <UniPuneExam> cmp = new Comparator<UniPuneExam>(){
			
			//Sorted By date
			
			public int compare(UniPuneExam p1,UniPuneExam p2) {

				return p1.date - p2.date;
			}
		};

		Collections.sort(al,cmp);
		System.out.println(al);

		Comparator<UniPuneExam> cmp2 = new Comparator<UniPuneExam>(){

			//sorted by subjects

			public int compare(UniPuneExam p1,UniPuneExam p2) {

				return p1.subject.compareTo(p2.subject);
			}
		};
		Collections.sort(al,cmp2);
		System.out.println(al);
	}
}
