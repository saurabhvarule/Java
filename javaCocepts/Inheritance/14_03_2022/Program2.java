

class x{

	static int x  =10;
	
	static{
		
		System.out.println("In static block x");
	}
	x(){
		
		System.out.println("In Constructor x");
	}
}

class y{


	x obj1 = new x();
}

class M	{
	public static void main(String[] args){
	
	y obj2 = new y();


	}
}
