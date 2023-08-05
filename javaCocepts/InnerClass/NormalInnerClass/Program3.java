

class Outer{

	int x =10;
	static int y =20;
	
		class Inner extends Outer{

			void m1(){
			System.out.println(x);
			System.out.println(y);	

			}
		}
	public static void main(String[] args){

		Outer o = new Outer();
		Outer.Inner i =o.new Inner();
		i.m1();
	}
}
