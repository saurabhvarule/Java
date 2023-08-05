
import java.io.*;


class P2{

	public static void main(String [] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("Enter Lower limit :");
		int lm = Integer.parseInt(br.readLine());

		System.out.println("Enter Upper Limit :");
		int up = Integer.parseInt(br.readLine());


		for(int i=lm;i<=up;i++){
			if(i%2==0){

				System.out.println(i);
			}
		}



	}
}
