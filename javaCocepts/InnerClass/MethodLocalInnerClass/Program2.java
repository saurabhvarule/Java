

class Outer2{

	int x =10;
	static int y =20;

	void m1(){

		class Inner{

			void m2(){

				System.out.println("In m2()");
			}
		}

		System.out.println("In m1() ");
		Inner i =new Inner();
		i.m2();
		
	}

	public static void main(String[] args){
		Outer2 o = new Outer2();
		o.m1();

	}
}
