

class Demo2 {

	private Demo2(){
		
		System.out.println("In Constructor");
	}
	void method1(){
		
		Demo2 obj1 = new Demo2();
		System.out.println("In method1");
	}
	public static void main(String[] args){
			
		Demo2 obj1 = new Demo2();
		Demo2 obj2 = new Demo2();
		obj1.method1();

		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));

	}

}
