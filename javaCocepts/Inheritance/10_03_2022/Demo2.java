

class P{

	P(){
		System.out.println(this);
	}

}
class C extends P{
		
	C(){
		System.out.println(this);
	}

}

class M{

	public static void main(String[] args){

		C obj = new C();


	}
}
