

class Demo4{
	
	int x=10;

	Demo4(){
		
		System.out.println("In No Argument");
	}
	Demo4(int x){
	
		//this.x = x;		//this.x=x____:	//many will predict that the value of x is 20 but it wont,it will be 10,if we write this.x=x; then it will throw 20
		System.out.println("In Paramitarized");
		System.out.println(x);
		System.out.println(this.x);
	}
	void m1(){
		
		System.out.println("In m1");
		System.out.println(x);
	}

	public static void main(String[ ]args){

		Demo4 obj1 = new Demo4();
		Demo4 obj2 = new Demo4(20);
		obj2.m1();


	}

}

/*The output will be like this :
 * In no argument 
 * in paramitarized
 * in m1
 * 10
 *
 * and 
 * after this.x=x;
 * it will change the value of x means 10 becomes 20
 *
 * this means class, and we declared int x gloabally means it the  part of a class 
 * */
