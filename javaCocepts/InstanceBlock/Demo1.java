

class Demo1{
	
	int x =10;

	Demo1(){
		
		System.out.println("IN Constructor");

	}

	{
		
		System.out.println("In Insance Block 1");

	}

 		public static void main(String[] args){

			Demo1 obj = new Demo1();
			System.out.println(obj.x);
		}

	{

		System.out.println("In instance Block 2");


	}

}
