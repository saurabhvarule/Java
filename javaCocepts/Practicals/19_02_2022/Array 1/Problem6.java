
import java.io.*;

class Problem6{

	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter size of array :");
	int size = Integer.parseInt(br.readLine());
	
	System.out.println("Enter Numbers :");
	int[] arr = new int[size];

	for(int i=0;i<size;i++){
		
		arr[i]=Integer.parseInt(br.readLine());
	}
		System.out.println("Output :");
		
		int min=0;
	 		for(int i =0;i<size;i++){
		 		if(arr[i]<min){
				 min = arr[i];
				}else if (min==0){
					 min = arr[i];
			
				}

			}
			System.out.println("Minimum value is : " + min);

		}
	
}	


