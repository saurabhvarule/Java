import java.io.*;

class P3{
	public static void main(String [] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		System.out.println("Enter Lower Limit ");
		int lm = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Upper Limit ");
		int up = Integer.parseInt(br.readLine());
		
		int sum=0;
		for(int i=lm;i<=up;i++){
			sum=sum+i;
			
	
		}
			System.out.print(sum);
	}

}
