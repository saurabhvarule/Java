

import java.io.*;

class Program3 {

	void printRevArr(int arr1[],int s){
		if (s > 0){
			System.out.print(arr1[s-1] + " ");
			printRevArr(arr1,s-1);
		}	
	}

	void printArr(int arr1[],int s){

		if (s > 0) {

			printArr(arr1,s-1);
			System.out.print(arr1[s-1] + " ");
		}
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Program3 o = new Program3();

		int s = 0;

		try {
			System.out.println("Enter no of elements :");
			s = Integer.parseInt(br.readLine());

	
		}catch(IOException ie) {

			System.out.println(ie);
		}

		int[] arr1 = new int[s];

		for(int i = 0; i < s; i++) {

			try{
				System.out.println("enter a value:");
				arr1[i]  = Integer.parseInt(br.readLine());
	
			}catch(IOException ie){

				System.out.println(ie);
			}
		}

		o.printArr(arr1,s);
		System.out.println();
		o.printRevArr(arr1,s);
	}
}
