

class Outer4{

	int x = 10;
	static int y =20;
	static void m1(){

		int z = 30;
		
		class Inner{

			void m2(){

				System.out.println("In Inner m2()");
//				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args){

         //	Outer4 o = new Outer4();
        // 	o.m1();
       //	Outer4.m1();

	}
}
