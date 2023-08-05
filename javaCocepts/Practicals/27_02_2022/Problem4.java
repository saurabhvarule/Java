import java.io.*;

class Problem4{
	public static void main(String [] args)throws IOException{

 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 	System.out.println("Enter Number Of Strings To Concat :");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter Strings In Array : ");
		String[] str1 = new String[size];
		for(int i=0;i<size;i++){
			str1[i]=br.readLine();

		}

		for(int i=0;i<size;i++){
			
			System.out.print(str1[i]);
			
		}
	
	}

}
