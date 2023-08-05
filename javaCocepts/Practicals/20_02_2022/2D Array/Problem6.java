import java.io.*;

class Problem6{

	public static void main(String [] args)throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

	System.out.println("Enter Number Of Rows : ");
	int row = Integer.parseInt(br.readLine());
	
	System.out.println("Enter Number Of Rows : ");
	int col = Integer.parseInt(br.readLine());

	int [][] arr = new int[row][col];
	int num = 11;
	
	for(int i=0;i<row;i++){

		for(int j=0;j<col;){
			int rev = 0;
			int rem = 0;
			for(int temp = num;temp!=0;temp=temp/10){
				
				rem = temp%10;
				rev = rev*10 + rem;
				if(num==rev){
					arr[i][j]=num;

					System.out.print(num + " ");
					
					j++;

				}
				
			}
			num++;
	
			
		}
		
		System.out.println();
	}


	}
}
