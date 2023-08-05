

class Demo12{
	
	int x = 10;
	static int y = 20;
	
	Demo12(){
		
		System.out.println("In Demo ()");
	}

	Demo12(int z){

		System.out.println("In Demo(int) ");
	}

	Demo12(Demo12 obj){
			
		System.out.println("In Demo (obj)");
		obj.m1();
	}
	 
	void  m1(){

		System.out.println("in m1");
		System.out.println(this);
	}

	public static void main(String[] args){

		Demo12 obj1 = new Demo12();
		obj1.m1();
		Demo12 obj2 = new Demo12(10);
		obj2.m1();
		Demo12 obj3 = new Demo12(obj1);
		obj3.m1();

	}
}
