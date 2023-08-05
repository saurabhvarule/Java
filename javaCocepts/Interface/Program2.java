/*

interface A{

	int x =10;

	interface B{
	
		int y =20;

	}
}

class P implements B{

	void m1(){

		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args){

		P  obj = new P();
		obj.m1();
	}

}*/
class A {
	int x = 10;

	class B{

		int y =20;

	void m1(){

		System.out.println(x);
		System.out.println(y);

	}
	}
}
class Main extends A{


	public static void main(String[] args){

		
		A a = new A();
		A.B b = a.new B();

		obj.m1();

	}
}
