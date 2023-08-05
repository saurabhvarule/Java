

class Program3 extends Thread{

	void fun(){

		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<10; i++){
		
			try{
				Thread.sleep(500);

			}catch(InterruptedException ie){

			}
			System.out.println("In fun");
		}
	}

	void gun(){
		
		System.out.println(Thread.currentThread().getName());	
	
		for(int i=0; i<10; i++){
		
			try{
				Thread.sleep(500);

			}catch(InterruptedException ie){

			}
			System.out.println("In gun");
		}

	}

	public void run(){

		if(Thread.currentThread().getName().equals("swift"))
			
			fun();
	

		if(Thread.currentThread().getName().equals("java"))
			
			gun();
		

	}

	public static void main(String[] args) {
	
		Program3 t1 = new Program3();
		t1.setName("swift");
		t1.start();
	
		Program3 t2 = new Program3();
		t2.setName("java");
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
	
		for(int i=0; i<10; i++){
			try{
				Thread.sleep(500);

			}catch(InterruptedException ie){

			}
			System.out.println("In main");
		
		}




	}
}
