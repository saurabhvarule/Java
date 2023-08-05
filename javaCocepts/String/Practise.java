

class Practise{

	public static void main(String[] args){

		String str1 = "SauRaBh";
		String str2 = new String("Varule");
		String str3 = "Saurabh";
		String str4 = "Saurabh";
		


		System.out.println(" Hash Code");
		System.out.println(str1);
		System.out.println(str1.hashCode());	//1000
		System.out.println(str2);
		System.out.println(str2.hashCode());	//1000

		System.out.println("Identity Hash Code");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));	//2000
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));	//3000


		System.out.println(str1.toUpperCase());
		System.out.println(str1.equals(str2));
		System.out.println(str1+str2);

	}



}
