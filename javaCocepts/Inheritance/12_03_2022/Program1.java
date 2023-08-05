

class Program1 {
	static int a = 10;
	int b =20;
	static {

		System.out.println("In static Block");
	}

	static void m1(){
		int b = 30;
		a= 40;
		System.out.println("In static void m1() ");
		System.out.println("Static var a =" + a);
		System.out.println("instance var b =" + b);
		System.out.println("Static var a(m1) =" + a);

	}

	{

		System.out.println("In Insatnce Block");
		System.out.println("this(Instance ) :" + this);
	}

	void m2(){
		
		int e = 50;
		int f  =60;
		int b = 70;

		System.out.println("In instace void  m2()");
		System.out.println("this(instance m2() :" + this);
		System.out.println("Instace var b =" + b);
		System.out.println("instance var b =" + this.b);
		System.out.println("instance var e =" + e);
		System.out.println("instace var f =" + f);
		System.out.println("instance var b =" + b);

	
	}

	Program1(){

		System.out.println("In Program1 Constructor");
		System.out.println("this(Program1 Constructor) :" + this);
	}	
	Program1(int x){
		
		System.out.println("In Program1 para (int)");
		System.out.println("this(Program1 para (int)) :" + this);
	}

	public static void main(String[] args){

		Program1 obj1 = new  Program1();
		Program1.m1();
		Program1 obj2 = new Program1(10);
		obj2.m2();
		

	}
}
