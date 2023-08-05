

class Parent {
	
	void m1() {

		System.out.println("in m1 parent");
	}


}
class Child extends Parent{

	void m2() {

		System.out.println("in m1 child");
	}

}
class Main{

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();

		p = c;
		Parent p1 = new Parent();


	}
}
