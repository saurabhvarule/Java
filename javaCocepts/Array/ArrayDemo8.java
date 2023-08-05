import java.io.*;

class ArrayDemo8{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());

		int[][] arr = new int[row][row];

		for(int i = 0;i<row;i++){
			for(int j=0;j<row;j++){
				
				arr[i][j]=Integer.parseInt(br.readLine());

			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				if((i==j) || (i+j)==row-1){
				
					System.out.print("0");
				}else{
					System.out.print(arr[i][j]);
				}
			}

				System.out.println();

		}
		

	}

}
