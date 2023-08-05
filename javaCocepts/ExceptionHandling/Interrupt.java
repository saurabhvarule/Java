

class Interrupt extends Thread{

	public void run() {

	}
	public static void main(String[] args ) {

		try{	

			Thread.sleep(1200);
			Interrupt i = new Interrupt();
			i.start();
			i.join();

		}catch(InterruptedException ie){
			
			System.out.println(ie);
		}
	}
}
