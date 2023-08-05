import java.io.*;

class Problem5{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows :");
		int row = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number of columns :");
		int col = Integer.parseInt(br.readLine());

		int num=1;
		int[][]arr = new int[row][col];

		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){

				arr[i][j]=num;
				
			}

		}
		for(int i=0;i<row;i++){
			
			for(int j=0;j<col;j++){
			//	num=num*10;0
				System.out.print(num*10 + " ");
				num++;
				
			}
			System.out.println();
			
		}
		

	}
}
