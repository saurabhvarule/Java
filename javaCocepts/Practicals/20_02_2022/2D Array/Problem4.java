import java.util.*;

class Problem4{

	public static void main(String[] args){
	
	Scanner obj = new Scanner(System.in);	

	System.out.println("Enter Number of Rows :");
	int row = obj.nextInt();

	System.out.println("Enter Number Of Columns :");
	int col = obj.nextInt();

	int num=1;

	int[][] arr = new int[row][col];

	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){

			arr[i][j]=num;
		}
	}
	//int num=1;
	System.out.println("Output :")
	for(int i=0;i<row;i++){

		for(int j=0;j<col;j++){
			 System.out.print(num + "  ");
			 num=num+2;
			 
		}
			System.out.println();
		//	num=num+2;
	}
		//	System.out.println();


	}

}
