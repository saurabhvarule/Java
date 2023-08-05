import java.io.*;

class ArrayDemo4{

	public static void main(String[] args:) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of Array");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter Numbers");
		int[] arr = new int [size];
		
		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(br.readLine());
		
		}
			System.out.println("The even numbers are :");
			for (int i=0;i<size;i++){

				if(arr[i]%2==0){
			
					System.out.println(arr[i]);
			}else{

					System.out.println("0");
			}
			
	                                                            
			
		}
	}
}
