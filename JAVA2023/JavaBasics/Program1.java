

class Main {
	
	static int x = 10;
	int m1() {

		System.out.println(x);
		return 0;
	}
	public static void main(String[] args) {	
		System.out.println("Hello! Welcome to java.");
		
		byte x = 20;
		System.out.println(x);
		
		byte y = 12;
		System.out.println(y);
		
		x = x + y;		// error
		x += y;	 		//32
		System.out.println(x);
		
		
		//Main obj = new Main();
		//obj.m1();
		//System.out.println(x);
	}
}
