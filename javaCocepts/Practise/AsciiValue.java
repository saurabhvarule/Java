/*			Program to print ascii values from 33 to 126		*/

class Ascii{

	public static void main(String[] args){
		
		char ch = 33;
		char q = '?';
		for(int i=33; i<126; i++){

			System.out.println("Ascii value of " + ch + " is " +(int)ch);
			ch++;
			try{
				Thread.sleep(100);
			}catch(InterruptedException ie){
					
				}

			}
	}

}
