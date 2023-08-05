import java.io.*;
import java.util.*;

class Problem3{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		

		System.out.println("Enter String ");
		String str1 = new String(br.readLine());
		
		StringBuffer sb = new StringBuffer(str1);
	
		//str1= sb.reverse().toString();
		
		StringTokenizer st = new StringTokenizer((str1)," ");
		System.out.println(str1);



	}

}

