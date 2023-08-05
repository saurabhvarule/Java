

class Parent{
	
	int a = 10;
	static int b =20;
	
	static {

		System.out.println("In Static Block - P");
	}
	
	Parent(){

		System.out.println("In Constructor - P");
	}
}

class Child extends Parent{

	Parent P = new Parent();

	static {

		System.out.println("In Static Block -C");
	}

	Child(){

		System.out.println("In Constructor -C");
	}
}

class Main{

	public static void main(String[] args){
	Parent P = new Parent();
	Child C = new Child();	

	
	}
}
