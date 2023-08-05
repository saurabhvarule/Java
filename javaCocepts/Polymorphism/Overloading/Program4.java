

class Parent{
	void p1(){

		System.out.println("in p1 ");
	}

}

class Child extends Parent{
	void p2(){

		System.out.println("in p2");
	}
	

}

class Main4{

	void m1(Parent p){

		System.out.println("m1 Parent");
		p.p1();
	}
	void m1(Child p){

		System.out.println("m1 Child");
		p.p1();
		p.p2();
	}

	public static void main(String[] args){

		Main4 m = new Main4();
	/*	m.m1(new Parent());
		m.m1(new Child());
		m.m1(null);
	*/
		m.m1(new Child());
		m.m1(new Parent());
	}
}
