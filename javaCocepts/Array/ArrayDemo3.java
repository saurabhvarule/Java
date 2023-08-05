import java.io.*;

class ArrayDemo3{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of Array");
		int n = Integer.parseInt(br.readLine());
		
		char[] crr = new char[n]; 
		System.out.println();
		for(int i = 0;i<n; i++){
			 crr[i] =(char)br.read(); 
			 br.skip(1);
		}
		System.out.println();

		for(int i=0;i<n;i++){
			System.out.println(crr[i]);
		}

	}

}
