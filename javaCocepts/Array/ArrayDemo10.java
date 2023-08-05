import java.io.*;

class ArrayDemo10{

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter number of rows");
		int row = Integer.parseInt(br.readLine());

		int[][][] arr = new int[2][row][row];

		System.out.println("Enter Numbers");
		for(int plane =0;plane<2;plane++){
			for(int i=0;i<row;i++){
				for(int j = 0;j<row;j++){

					arr[plane][i][j]=Integer.parseInt(br.readLine());
				
			}
		}

	}
	   	for(int plane=0;plane<2;plane++){
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){

					System.out.print(arr[plane][i][j] + " ");
			}	
				System.out.println();
		}
	}
		
		for(int plane=0;plane<2;plane++){
			int sum = 0;
			for(int i=0;i<row;i++){
				
				for(int j=0;j<row;j++){
					
					if(i==j){
						
						sum=sum+arr[plane][i][j];
					}
					


				}
				

		
			}

			System.out.println("The sum of diagonal in plane "+ plane+" is "+ sum);
		}

	}

}
