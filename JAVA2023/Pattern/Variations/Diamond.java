/*
			 *
		      *  *  *
		   *  *  *  *  *
		      *  *  *
		         *   
*/
import java.io.*;

class Diamond {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of rows :");
		int row = Integer.parseInt(br.readLine());

		for(int i=0; i<row*2-1; i++) {

			int a;
			int b;
			if(i>=row) {
				a = (i-row)+1;
				b = ((2*row-1 - i) * 2) - 1;
			} else {
	
				a = row - (i+1);
				b = 2*i + 1;
			}
			for(int j=0; j<a; j++) {

				System.out.print("  ");
			}
			for(int k=0; k<b; k++) {

				System.out.print("* ");
			}
			System.out.println();
		}

		
	}
}
