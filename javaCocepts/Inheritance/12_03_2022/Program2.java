

class Parent{

	int a =10;
	
	static int b =20;

	static {

		System.out.println("in Static Block Parent");
	}
	
	Parent(){

		System.out.println("In parent Constructor");
		System.out.println("static var b = " + b);
	}
	void m1(){

		System.out.println("In m1();");
		System.out.println("var a = " + a);
	}
	
	static void m2(){

		System.out.println("in static m2();");
	}
}

class Child extends Parent{

	int c =30;
	
	static int d =40;
	
	static {

		System.out.println("in Static Block Child");
	}
	
	Child(){

		System.out.println("In Child Constructor");
		System.out.println("static var d = " + d);
	}
	void m3(){
		System.out.println("In child  m3()");
		System.out.println("var c = " + c);
	}
	
	static void m4(){

		System.out.println("In static m4(); ");
	}
}

class Program2{

	public static void main(String[] args){

		Child obj1 = new Child();
//		Parent obj2 = new Parent();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.m4();
	}
}
