

class InstanceMet{
		
	static InstanceMet obj = new InstanceMet();
	int x =10;

	InstanceMet(){
		
		System.out.println("In Const :");
		System.out.println(x);
	}

	{
		
		System.out.println("In Instance Block :");
		System.out.println(x);
	}

	void m1(){
		
		System.out.println("In m1 :");
	
	}

	public static void main(String[] args){
		
//		InstanceMet obj = new InstanceMet();
		obj.m1();
	}

}
