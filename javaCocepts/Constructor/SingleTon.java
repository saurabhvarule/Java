

class Parent{

	static Parent obj1 = new Parent();

	private Parent(){

		System.out.println("In Constructor");
	}
	
	static Parent m1(){
		
		return obj1;
	}
}

class CreateObject{
	
	public static void main(String[] args){

		Parent ret1 = Parent.m1();
		System.out.println(System.identityHashCode(ret1));
		
		Parent ret2 = Parent.m1();
		System.out.println(System.identityHashCode(ret2));

		Parent ret3 = Parent.m1();
		System.out.println(System.identityHashCode(ret3));



	}


}


