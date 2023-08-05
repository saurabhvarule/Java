

class Demo1{
	

	int x=0;
	private Demo1(){

		System.out.println("In Constructor");
	}
	public static void main(String[] args){

		Demo1 obj = new Demo1();
		System.out.println("In main method");
		
		Demo1 obj2 = new Demo1();
		System.out.println(obj.x);
		System.out.println(obj2.x);

	}
}
