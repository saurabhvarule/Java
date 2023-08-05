

class Outer{
	
	int x =10;
	static int y=20;

		class Inner{
			int x=10;
			//	static int y =20;	//error: for this we cant write static in inner class
			void m1(){
			
				System.out.println(y);		// but we can access static in inner class

			}
	}


}


