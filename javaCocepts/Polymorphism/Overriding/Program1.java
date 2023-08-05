

class Parent{

	void m1(){

		System.out.println("in parent m1");
	}
}
class Child extends Parent{

	void m1(){

		System.out.println("in child m1 ");
	}

}
class Main{

	public static void main(String[] args){

		Parent p = new Child();	//in the byte code compiler binds the method of parent but in runtime method call goes to child
		p.m1();		//OverRiding

	}
}
