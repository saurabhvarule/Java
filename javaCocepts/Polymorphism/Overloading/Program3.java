

class Demo2{

	void m1(int x,int y){

		System.out.println("int - int");
	}
	void m1(float x,float y){

		System.out.println("float - float");
	}
	void m1(int x,float  y){

		System.out.println("int - float");
	}
	void m1(float x,int y){

		System.out.println("float - Int");
	}
/*	void m1(int x,char y){

		System.out.println("int - char");
	}
*/
	void m1(char x,int y){
		System.out.println("char - int ");
	}
}
class Main3{

	public static void main(String[] args){

		Demo2 d = new Demo2();
		d.m1(10.5f,10.5f);
		d.m1('a','b');
	}
}
