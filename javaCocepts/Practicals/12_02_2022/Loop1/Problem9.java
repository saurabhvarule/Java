
import java.io.*;
class Problem9{

	public static void main(String [] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter no rows :");
		int row = Integer.parseInt(br.readLine());
		int num1 =2;
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){
			System.out.print(num1-i+" ");
			num1++;	
			}

			System.out.println();
				
			
		}


	}
}
