import java.io.*;

class Program1 {

	void fun(int num1) {
	
		if(num1 > 0){	
			
			fun(num1-1);
			System.out.println(num1);
		}
	
		

	}

	public static void main(String[] args) throws IOException {

		Program1 obj1 = new Program1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("enter no :");	
		int num1 = Integer.parseInt(br.readLine());
		obj1.fun(num1);
	}

}
