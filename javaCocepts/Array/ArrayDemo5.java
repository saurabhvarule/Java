import java.io.*;

class ArrayDemo5{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size :");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter numbers :");
		int[] num = new int[size];

		for(int i=0;i<size;i++){
			num[i]=Integer.parseInt(br.readLine());

	}
		for(int i=0;i<size;i++){

			if(num[i]%2==0){

				System.out.println(num[i]);
			}else{
			
				System.out.println((char)num[i]);
			}
		}

	}
}
