import java.io.*;

class Problem8{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size Of Array : ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter Numbers In Array : ");
		int [] arr = new int[size];
//int repeat = -1;
		for(int i=0;i<size;i++){
			
			arr[i]= Integer.parseInt(br.readLine());
		}
			for(int i = 0;i<size;i++){
			int count =0;
			//int repeat =0;
				for(int j=0;j<size;j++){
				
					if(arr[i]==arr[j]){
					count++;
				
				
				}
			}
			
			System.out.println("Frequency  of :"+ arr[i] + "is :" + count );
			

		}


		
	}
}

