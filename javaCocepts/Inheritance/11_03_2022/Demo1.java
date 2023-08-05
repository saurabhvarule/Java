

class Parent{
	int a = 10;
	static int b = 20;
	Parent(){
		System.out.println("in parent ");
	}
	static{

		System.out.println("In parent static");
	}
}

class Child1 extends Parent{

	int p =30;
	static int q =40;
	Child1(){
		System.out.println("in Child1 ");
	}
	static{
		System.out.println("in child1 static");
	}
}

class Child2 extends Child1{

	Child2(){
	
		System.out.println("in Child2");

	}
	static {
		
		System.out.println("in child2 static");
	}
}

class Demo1{

	public static void main(String[] args){
		
	//	Child1 obj1 = new Child1();
		Child2 obj2 = new Child2();
	}
}
