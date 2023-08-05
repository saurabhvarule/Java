

class P1 {
	
	P1(){
		System.out.println("In P1 Constructor");
	}

	static {

		System.out.println("In Static P1");
	}


}

class C1 extends P1{

	C1(){
		System.out.println("In C1 Constructor");
	}
	static{

		System.out.println("In Static C1");
	}

	//public static void main(String[] args){

	//}
}

class Demo2{
	
	public static void main(String[] args){
	P1 obj = new P1();
	C1 obj2 = new C1();
	}
}


