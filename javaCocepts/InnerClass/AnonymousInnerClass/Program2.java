

class Parent2{

	void m1(){

		System.out.println("in m1 ()");
	}
}

class Demo2{

	public static void main(String[] args){

	//	Parent p = new Parent(){	if we want to overide parent method 
			new Parent(){
		
			void m2(){	//void m1()	parent and anonymous have same methods m1 in this scenario,we override parent method 

			//	System.out.println("In m1 Demo$1");
				System.out.println("In m2()");
			}
		}.m2();
	//	p.m1();
		
	}
}
