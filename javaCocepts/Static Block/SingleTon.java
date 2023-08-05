

class SingleTon {
	
	static SingleTon obj = new SingleTon();

	private SingleTon(){
		System.out.println("In Constructor");
	}
	
	static SingleTon method1(){

		return obj;
	}
}
class SingleTon2{

	public static void main(String[ ] args){

		SingleTon ret1 = SingleTon.method1();
		SingleTon ret2 = SingleTon.method1();
		SingleTon ret3 = SingleTon.method1();
		System.out.println(System.identityHashCode(ret1));
		System.out.println(System.identityHashCode(ret2));
		System.out.println(System.identityHashCode(ret3));
	}
}
