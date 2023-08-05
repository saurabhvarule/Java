

class StaticDemo2{

	static StaticDemo2 obj1 = new StaticDemo2();
	int x =10;
//	System.out.println(obj1.x);

	StaticDemo2(){
		
		System.out.println("In constructor ");

	//	System.out.println(obj1.x);	this will throw a run time error	Exception intilizer error
	}
	static{

	
	}

	public static void main(String[] args){
	
		System.out.println(obj1.x);
	}


}
