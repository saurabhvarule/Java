

class Demo6{
	
	static int x =10;

	Demo6(){
		int x =30;
		System.out.println("in no arg");
		System.out.println(this.x);		//10
		System.out.println(x);			//30
	}

	Demo6(int x){

		this.x = 50;
		x = 60;
		System.out.println("in Int ");
		System.out.println(this.x);		//50
		System.out.println(x);			//60
	}

	public static void main(String[] args){
		

		Demo6 obj1 = new Demo6();
		Demo6 obj2 = new Demo6(20);



	}
}
