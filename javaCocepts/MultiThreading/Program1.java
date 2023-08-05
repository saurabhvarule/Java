/*
 *  		Threre are two ways two make a Thread
 *  		1.By using Thread class 
 *  		2.By ussing interface Runnable
 *
 			In this Program ,We are using Thread Class to make Thread	
			Here's, How we can make Thread:
			its really simple
*/


class Program1 extends Thread{			// we need to extends Thread class

	public void run(){   	//-->>public method run() 	 // Run method is of Thread class and its public
								//  when we start the Thread it directly jumps on run method.
		
		System.out.println(Thread.currentThread().getName());		//we can use this line to print curent Thread name
		
		for(int i=0; i<20; i++){

			System.out.println("In run");
		}
	}

	public static void main(String[] args) {
		
		// main thread
		System.out.println(Thread.currentThread().getName());

		Program1 obj = new Program1();
		obj.start();

		for(int i=0; i<20; i++){

			System.out.println("In main");
		}

	}
}
