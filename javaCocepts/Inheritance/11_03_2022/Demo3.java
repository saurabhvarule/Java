

class P2{
	
	{

		System.out.println("In P2 Instance block");
	}
	static{
		
		System.out.println("In P2 static block");

	}

	P2(){
		
		System.out.println("In P2 Constructor");

	}
}

class C2{
	{

		System.out.println("In C2 instacnce block");
	}
	static{
		
		System.out.println("In C2 Static block");
	}
	C2(){

		System.out.println("In C2 Constructor");
	}
	public static void main(String[] args){


	}

}

/*class Demo3{

	public static void main(String[] args){

		//P2 obj1 = new P2();
		C2 obj2 = new C2();
	}
}*/
