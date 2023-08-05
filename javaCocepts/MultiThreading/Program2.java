/*		making Thread bu using interface Interface		*/


class Program2 implements Runnable{

	public void run(){
		
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<20; i++){

			System.out.println("In run");
		}
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		Program2 obj = new Program2();
		Thread T1 = new Thread(obj);
		T1.start();

		for(int i=0; i<20; i++){

			System.out.println("In main");
		}
	}

}
