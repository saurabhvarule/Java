import java.io.*;

class P4{
	public static void main(String [] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Lower Limit");
		int lm = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Upper Limit");
		int up = Integer.parseInt(br.readLine());

		int mult=1;
		for (int i =lm;i<=up;i++){

			mult=mult*i;
		}
			System.out.println(mult);
	}
}
