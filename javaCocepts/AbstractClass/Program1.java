

abstract class Parent{

	 void m1(){
		
		 System.out.println("in parent m1()");

	 }
}

 class Child extends Parent{


/*	abstract void m1();{

		 System.out.println("in child m1()");
	}*/

	public static void main(String[] args){
		Child m = new Child();
		m.m1();
	}	

}

/*class Main extends Parent{
		
	void m1(){

			System.out.println("in main");
		}

	public static void main(String[] args){
		Main m = new Main();
		m.m1();


	}
}*/
