

class Demo3{

	Demo3(){
		
		System.out.println("In No Argument");

	}
	
	Demo3(int x){
	
		System.out.println("In Paramitarized");

	}
	
	public static void main(String[ ]args){
		
		Demo3 obj1 = new Demo3();
		Demo3 obj2 = new Demo3(10);
		Demo3 obj3 = new Demo3('A');		//-->>  this will be in a paramitarized const because char can be converted to int.
		//Demo3 obj4 = new Demo3(10.5f);

	}
}
