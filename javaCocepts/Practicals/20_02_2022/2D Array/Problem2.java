import java.io.*;

class Problem2{

	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	
	System.out.println("Enter Numbers In Array :");
	int arr[][] = new int[2][2];

	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){

			arr[i][j]=Integer.parseInt(br.readLine());

		}
	}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){

				System.out.print(arr[i][j] + " ");
		}
	
			System.out.println();
		}
	


	

	}
}

