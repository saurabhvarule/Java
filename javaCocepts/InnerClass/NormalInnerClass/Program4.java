

class Outer{			//this

	int x =10;

	class Inner1{		//this,this$0
		
		int x =100;

		class Inner2{	//this,this$1,this$0

			int x=1000;
			void m1(){

				System.out.println(this.x);
				System.out.println(Inner1.this.x);
				System.out.println(Outer.this.x);
			}

		}

	}

	public static void main(String[] args){

		Outer o = new Outer();
		Outer.Inner1 i1 = o.new Inner1();
		Inner1.Inner2 i2 = i1.new Inner2();
		i2.m1();
	}
}
