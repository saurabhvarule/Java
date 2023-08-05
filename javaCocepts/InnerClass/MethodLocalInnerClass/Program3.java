

class Outer3{

	static void m1(){

		class Inner{

			void m2(){

				System.out.println("In Inner m2()");
			}
		}

		System.out.println("In static m1() ");
		Inner i = new Inner();
		i.m2();
	
	}

	public static void main(String[] args){

		Outer3.m1();
	}


}
