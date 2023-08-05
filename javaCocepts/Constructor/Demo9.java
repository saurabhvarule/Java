

class Demo9{
	
	int x =10;
	Demo9(){
	//	this(x);	error: can not refferenced this before supertype constructor has been called ,values are not initilized in constructor where this in use
		this(10);		
		System.out.println(this);	// Demo9@1db9742

	}
	
	Demo9(int y){
		
	//	this();		// error : recursive constructor invocation
		System.out.println("in int ");
	}
	public static void main(String[] args){
		
		Demo9 obj = new Demo9();
		System.out.println(obj);	//  Demo9@1db9742

	}
}

