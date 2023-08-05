import java.io.*;


class InputDemo2{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


		System.out.println("Enter Player Info : ");
		System.out.println("Enter Player Name");
		String sr = br.readLine();

		System.out.println("Enter JerSey Number : ");
		int jr = Integer.parseInt(br.readLine());

		System.out.println("Enter Average : ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println(sr);
		System.out.println(jr);
		System.out.println(avg);

		
	}
}
