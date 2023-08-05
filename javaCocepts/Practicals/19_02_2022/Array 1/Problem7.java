import java.io.*;

class Problem7{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size");
		int size = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Numbers in array :");
		int[] arr = new int[size];

		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
			int sum=0;

			System.out.println("Output");
			for(int i=0;i<size;i++){
				sum=arr[i]+sum;
			}

			System.out.println(sum);



	}
}
