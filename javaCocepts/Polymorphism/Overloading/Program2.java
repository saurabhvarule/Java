

class Demo{

/*	void m1(int x){

		System.out.println(" m1 int ");
	}
*/
	void m1(char x){

		System.out.println(" m1 char ");
	}
/*	void m1(float x){

		System.out.println("m1 float");
	}
*/	
	void m1(double x){

		System.out.println("m1 Double");
	}
	void m1(long x){

		System.out.println("m1 long");
	}
	
	
}

class Main{

	public static void main(String[] args){

		Demo d = new Demo();
	//	d.m1('A');
	//	d.m1(10.5f);

	}								
}
										/*  Follows this Sequence if dosent match same parameter:
										 *   
										 *   double
										 *     ^
										 *     |
										 *   float
										 *     ^
										 *     |
										 *    long
										 *     ^
										 *     |
										 *    int
										 *     ^
										 *     |
										 *    char
										 *
										 */    
