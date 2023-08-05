
import java.io.*;
class Problem6{

	public static void main(String [] args) throws IOException {

		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

	
			System.out.println("Enter n limit");
			int limit = Integer.parseInt(br.readLine());
			int num = limit;
			for(int i=1;i<=limit;i++){
				int x=1;
				for(int j=1;j<=10;j++){
					System.out.print(num*x + " ");
					x++;
					
						
				}
					System.out.println();
					num--;
				
	
		}

	}	
}

