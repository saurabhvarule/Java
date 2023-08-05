

class Parent {

	void m1(){

		System.out.println("in m1 ()");
	}

	void m1(){

		System.out.println("in m1 ()");//error : method m1 is already define in  class parent


	}


}

class Main{


	public static void main(String[] args){

		Parent obj = new Parent();
	}
}
