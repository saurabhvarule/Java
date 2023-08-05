import java.util.*;

class ArrayDemo7{
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);

	int[][] arr = new int [3][3];
	
	System.out.println("Enter Numbers ");
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			arr[i][j]=obj.nextInt();
		}

	}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(arr[i][j] + " ");
		}

			System.out.println();
	}


	}

}
