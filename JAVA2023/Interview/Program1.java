class Main {
	int x = 10;
	static int y = 20;
	private int z = 30;
	
	Main(){

		System.out.println("In private constructor");
		System.out.println(y);
	}
	/*public static void main(String[] args) {

		Main obj = new Main();
	}*/
}

class Child extends Main {
	
	public static void main(String[] args) {

		Child obj = new Child();
		System.out.println(obj.x);		//default
		System.out.println(obj.y);		//static
		//System.out.println(obj.z);		//private
		y = 50;
		System.out.println(Main.y);		//static from Main class
		System.out.println(obj.y);		//static from Child class
	}

}
