
import java.io.*;
class InputDemo3{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		for(int i=1;i<=4;i++){

		System.out.println("World Cup ");
		System.out.println("Enter Contry Name : ");

		String str = br.readLine();


		System.out.println("Ranking : ");
		int rank = Integer.parseInt(br.readLine());


		System.out.println("Group : ");
		char grp = (char) br.read();


		System.out.println("Country name is :"+ str);
		System.out.println("Rank is :"+ rank);
		System.out.println("Group is :"+ grp);
		br.skip(1);
		
		}
		
	}

}
