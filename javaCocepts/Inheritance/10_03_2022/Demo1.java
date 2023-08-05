

class Parent{

	int x = 10;
	static int y = 20;
	
	Parent(){
		
		System.out.println("In Parent");
	}

}

class Child extends Parent{

	int p = 30;
	static int z = 40;

	void m1(){
		
		System.out.println("In m1");
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(z);
	
	}
}

class Main{
		
	public static void main(String[] args){
		
		Child obj = new Child();
		obj.m1();
	}
}
