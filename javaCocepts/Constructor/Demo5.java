

class Demo5{

	Demo5(){
	
		System.out.println("In const ");
	
	}
	
	Demo5(int x){
		
		System.out.println("In Const Para");
		System.out.println(x);
	}
	
	public static void main(String[] args){

		Demo5 obj1 = new Demo5();
		Demo5 obj2 = new Demo5(5);

	}

}
