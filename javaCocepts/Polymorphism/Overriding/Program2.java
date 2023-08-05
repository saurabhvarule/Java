


class Parent2{

//1	
	/*void m1(){
		
		System.out.println("In Parent m1");
	}*/


//2
	/*	private void m1(){

		System.out.println("In parent m1");
	}*/

//3
	 /* private void m1(){

		System.out.println("In parent  m1");

	}*/
	
//4
	/*void m1(){

		System.out.println("parent m1");
	}*/

//5
      	/*public void m1(){

		System.out.println("parent m1");
	}*/

//6
	/*public void m1(){

		System.out.println("parent m1");
	}*/

//7
	/*void m1(){

		System.out.println("parent m1");
	}*/

//8
	/*final void m1(){

		System.out.println("parent m1");
	}*/
	
//9
	/*static void m1(){

		System.out.println("parent m1");
	}*/

//10	
	/*static void m1(){

		System.out.println("parent m1");
	}*/





}

class Child2 extends Parent2{

//1
	/*void m1(){

		System.out.println("In Child m1");	Output : in child m1 -->m1 in child overrieds m1 in parent

	}*/

//2
	/* private void m1(){

		System.out.println("In Child m1");	error : m1 has private access in parent

	}*/
//3

	/* void m1(){

		System.out.println("Child m1");		error : m1 has priavte accesss in parent
	}*/



//4
	/*private void m1(){

		System.out.println("child m1");		error : m1 in child can not override m1 in parent,attempting to access weaker access privileges
	}*/

//5
	/*public void m1(){

		System.out.println("child m1");		output: child m1 	-->>if both methods are public then child can override parent method 
	}*/

//6
	/*void m1(){

		System.out.println("child m1");		error; m1 in child can not override m1 in parent ,attempting access weaker access privileges,in short we can not shrink the scope which has bigger access 								 in parent class.
	}*/

//7
       	/*public void m1(){

		System.out.println("child m1");		output : child m1 ,we can expand scope in child class which is public -->>default > public
	}*/
	
//8
	/*void m1(){

		System.out.println("child m1");		error ; m1 in child can not override m1 in parent , overhidden mehod is /~final~/ 
	}*/

//9
	/*void m1(){

		System.out.println("parent m1");	error : m1 in child can not override m1 in parent ,overhiiden method is /~static~/
	}*/

//10
	/*static void m1(){

		System.out.println("child m1");		output: parent m1
	}*/



	public static void main(String[] args){
		
		Parent2 p = new Child2();
		p.m1();


	}
}
