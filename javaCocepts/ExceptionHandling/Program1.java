import java.io.*;

class ExceptionDemo{

	static void gun(){

		System.out.println("In gun");
		

	}

	static void fun(){
		
		gun();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			br.close();
			br.readLine();
			System.out.println("In fun after gun");
		}catch(IOException ex){

			System.out.println("Stream Closed by Saurabh");
			ex.toString();
		}
	}

	public static void main(String[] args){

		System.out.println("in main");
		fun();
		System.out.println("At home ");

	}
	
}
