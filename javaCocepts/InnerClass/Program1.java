

class Outer{


	class Inner{
		int x =30;
		void m1(){
			System.out.println(this);
			System.out.println(x);
		}

	}

	static void m2(){
			
		Outer o = new Outer();

		Inner i = o.new Inner();
		i.m1();


	}
	public static void main(String[] args){
		//Outer o = new Outer();
//		Outer.Inner i = o.new Inner();
		Outer.m2();
	}
}
