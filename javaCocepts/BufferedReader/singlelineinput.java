import java.util.*;
import java.io.*;

class SingleInput{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str,",");

		String token1 = st.nextToken();
		String token2 = st.nextToken();
		String token3 = st.nextToken();
		String token4 = st.nextToken();

		System.out.println(token1);
		System.out.println(token2);
		System.out.println(token3);
		System.out.println(token4);



	}
}
