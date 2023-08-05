import java.io.*;

class Problem2{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Numbers");

		int[] arr = new int[5];

			for(int i=0;i<5;i++){

				arr[i] = Integer.parseInt(br.readLine());

			}
			System.out.println("Output :");
			for(int i = 0;i<5;i++){
	
				System.out.println(arr[i]);
			}
	



	}
}
