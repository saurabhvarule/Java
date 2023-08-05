

class Alpha1 extends Thread {
	
	void fun(){

		System.out.println("in fun");
		//try{
			for(int i=0; i<10; i++){

				System.out.println(i/0);

				}
	/*	}catch(ArithematicException ae){

				System.out.println("Arithmetic Exception aal re bhangar ki shakal");
			}*/
		}
	
	public void run(){
		
		System.out.println("in run-ALpha1");
		

	}
}
class Alpha2 extends Thread {
	Alpha1 obj = new Alpha1();
	void gun(){

		obj.fun();
		System.out.println("in gun");
		obj = null;
		try{
			obj.fun();
		
		}catch(NullPointerException ne){
			
			System.out.println("NullPointerException aal re bhangar ki shakal");

		}

	}
	public void run(){
		
		System.out.println("in run -ALpha2");
		gun();


	}

}

class Program4{

	public static void main(String[] args){

		Alpha1 t1 = new Alpha1();
		try{
			t1.join();
		}catch(InterruptedException ie){

			System.out.println("InteruptedException aal re bhangar k shakal ");
		}
		t1.start();

		Alpha2 t2 = new Alpha2();
		try{
			t2.join();
		}catch(InterruptedException ie){

			System.out.println("interruptedException aal re bhangar k shakal");
		}
		t2.start();
	}
}
