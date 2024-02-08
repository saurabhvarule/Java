


class Main {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("World");
		String str4 = new String("World");
		String str5 = "Hello Saurabh";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
		String rev = "";
		for(int i=str1.length()-1; i>=0; i--) {
			rev = rev + str1.charAt(i);
		}

		System.out.println(str1);
		str1 = rev;
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		char[] carr = str1.toCharArray();
		for(int i=0; i<carr.length; i++) {

			System.out.println(carr[i]);
		}
	}
}
