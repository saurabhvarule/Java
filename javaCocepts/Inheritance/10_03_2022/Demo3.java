

class P2{

	void m1(){
		
		System.out.println("In m1");
	}

	static void m2(){
		
		System.out.println("in static m2");
	}
}

class C2 extends P2{

	void m3(){

		System.out.println("in m3");
	}
}

class M2{

	public static void main(String[] args){

		C2 obj1 = new C2();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
}
