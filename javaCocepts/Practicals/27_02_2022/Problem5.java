import java.io.*;

class Problem5{

	
		public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String you want to check ;");
		String str1 = br.readLine();
		String str2 = "";

		int size = str1.length();
		//System.out.println(size);

		for (int i=size-1;i>=0;i--){

			str2=str2+str1.charAt(i);

		}if(str1.equalsIgnoreCase(str2)){
			
			System.out.println(str1 + ":" + " Is a Palindrome String ");
		}else{

			System.out.println(str1 + ":" + " Not a Palindrome String ");
		}


	}


}
