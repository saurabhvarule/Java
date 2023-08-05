

interface Ankit{

	default void programming(){
		System.out.println("Python");
	}
}
class Saurabh implements Ankit{
	
	public void programming(){

		System.out.println("Java");
	}
	public static void main(String[] args){
		
		Ankit a = new Saurabh();
		a.programming();

	}
}
