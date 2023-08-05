

class StringDemo2 {

	public static void main(String[] args){

		String str1 ="c2w";
		String str2 ="c2w";

		System.out.println( str1==str2);		//True

		String  str3 = "c2wtech";
		str2 = str2 + "tech";

		System.out.println( str3==str2);		//False

		String str4 = new String("c2wtech");

		System.out.println( str4==str3);		//False

		String str5 = new String("c2wtechnew");
		System.out.println( str5==str4);		//False

		str4 = str4 + "new";

		System.out.println( str5==str4);		//False


				
	}

}
