

class Mall{

	int x =10;
	static int y =20;

	void m1(){

		System.out.println("in m1");
	}

		class Shop{
	
			int x=10;
		
			void m1(){

				System.out.println("in shop m1");
				System.out.println(y);
			}
		}

	static void m2(){

		System.out.println("In static m2");
	}

}

class Demo{

	public static void main(String[] args){

		Mall M = new Mall();
		Mall.Shop S = M.new Shop();
		M.m1();
		M.m2();
		S.m1();

		

	}
}
