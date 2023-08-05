

class Demo10{
	

	int x  = 10;
	static int y = 40;

	Demo10(){
	
		super();
	}

	
}
class DemoMain{
	
	public static void main(String[] args){
		
		Demo10 obj1 = new Demo10();
		Demo10 obj2 = new Demo10();
		
		obj1.x =30;
		System.out.println(obj1.x);	//30		// instace var are changed in specified object so the change  dosent affect to onother object as the output showing the results.
		System.out.println(obj2.x);	//10
		
		obj1.y=50;
		System.out.println(obj1.y);	//50		//when we change a static var(int y = static) it changes globally thats why it will print changed var in all objects .
		System.out.println(obj2.y);	//50
	}
}


/*

 * output :

 * 30
 * 10
 * 50
 * 50
  
 */
