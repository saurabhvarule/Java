
import java.io.*;

class Problem3{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array Size");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter Numbers");

		int[] arr = new int[size];

			for(int i=0;i<size;i++){

				arr[i] = Integer.parseInt(br.readLine());

			}
			System.out.println("Output :");
			for(int i = 0;i<size;i++){
	
				System.out.println(arr[i]);
			}

	}
}
