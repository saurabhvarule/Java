import java.io.*;

class Problem8{

	public static void main(String[] args ) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Lower Limit : ");

		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Uper Limit : ");
		int num2 = Integer.parseInt(br.readLine());

		
		for(int i=num1;i<=num2;i++){
			if((i)%2==0 && (i)%5==0){
				System.out.println(i + " ");
				
			}
				
		}

	}
}
