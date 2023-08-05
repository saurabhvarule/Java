

class Sdemo {


	String str1 = "Core2Web";
	static String str2 = new String ("Core2web");

	void method1(){

		String str3 = "Core2Web";
		String str4 = new String("Core2Web");
		System.out.println(str3.replace("2Web"," "));
		System.out.println(str4);


	}
	
	static void method2(){

		String str5 = "Core2Web";
		String str6 = new String("Core2Web");
		System.out.println(str5.replace("2Web"," "));
		System.out.println(str6);
	
	}


	public static void main(String[] args){
		
		Sdemo obj = new Sdemo();
		System.out.println(obj.str1.replace("2Web"," "));
		System.out.println(obj.str2);
		//obj.str4 = obj.str4.replace("2Web"," ");
		obj.method1();
		//obj.str6 = obj.str6.replace("2Web"," ");
		obj.method2();
		

	}

}
