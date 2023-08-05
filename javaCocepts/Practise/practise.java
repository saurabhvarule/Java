

class Demo{

	public static void main(String[] args){

		String str1 = "Core2web";
		System.out.println("str1 :" + System.identityHashCode(str1));	//1000
		String str2 = new String ("Saurabh");
		System.out.println("str2:" + System.identityHashCode(str2));	//2000
		str2=str2.intern();
		System.out.println("str2 after intern() :" + System.identityHashCode(str2));	//1000
		System.out.println(str1==str2);		//true



	}

}
