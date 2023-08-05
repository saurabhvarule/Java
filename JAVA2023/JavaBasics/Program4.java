
import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char carr[] = new char[6];

		for(int i=0; i<carr.length; i++) {
			System.out.println("enter a charater :");
			carr[i] = sc.next().charAt(0);
		}
		for(int i=0; i<carr.length; i++) {

			System.out.println(carr[i]);
		}

	}
}
