import java.io.*;


class Program2 {

	void fun(int num){

		if(num > 0){

			System.out.println(num);
			fun(num - 1);
		}
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Program2 o = new Program2();

		System.out.println("enter no :");
		try{
			int num1 = Integer.parseInt(br.readLine());
			o.fun(num1);
		}catch(IOException ie){
		
		}



	}
}
