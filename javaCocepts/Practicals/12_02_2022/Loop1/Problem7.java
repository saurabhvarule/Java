import java.io.*;

class Problem7{

	public static void main(String [] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number");
		int num2 = Integer.parseInt(br.readLine());
			
			for(int i=num2;i>=num1;i--){
				if(i%2==0){
				
				
					System.out.print(i + " " );
					
				
				}
		}
			
	}

}


