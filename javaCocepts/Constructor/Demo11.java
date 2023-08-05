

class Demo11{


	int x =10;
	
	void m1(){
		
		System.out.println(this.x);
	}

	static void m2(){
	//	System.out.println(this.x);   error will throw an error because non static var this can not be refferenced  from a static context .this refference can be written only in instace and constructor.
	
		System.out.println("in static method m2 :");
	
	}

	public static void main(String[] args){
		
		Demo11 obj1 =new Demo11();
		obj1.m1();
		obj1.m2();
	}


}
