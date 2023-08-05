

class Parent{

	void m1(){

		System.out.println("In m1 () ");
	}
}

class Child extends Parent{

	void m2(){

		System.out.println("In m2 ()" );
	}
}

class Demo{

	public static void main(String[] args){

		Parent P = new Parent(){
			
			void m3(){

				System.out.println("In m1() Demo$ ");
			}

		};
	
	}
}
