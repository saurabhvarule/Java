import java.util.*;

class Problem3{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Number Of Rows :");
		int row = obj.nextInt();

		System.out.println("Enter Number Of Columns :");
		int col = obj.nextInt();

		System.out.println("Enter Numbers In Array :");
		int [][] arr = new int[row][col];

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			
				arr[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}


}
