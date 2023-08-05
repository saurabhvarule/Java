

import java.io.*;

class RotateArray {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int[] rotateArray(int arr1[],int N) {	
		N = N%arr1.length;
		while(N>0) {

			int temp = arr1[arr1.length-1];
			for(int i=arr1.length-2; i>=0; i--) {

				arr1[i+1] = arr1[i];
			}
			arr1[0] = temp;
			N--;
		}
		return arr1;
	}
	public static void main(String[] args) throws IOException{
		RotateArray ra = new RotateArray();
		System.out.println("How many times do you want to rotate?");
		int N = Integer.parseInt(ra.br.readLine());	
		int arr1[] = new int[]{1,2,3,4,5};
		arr1 = ra.rotateArray(arr1,N);
		for(int i=0; i<arr1.length; i++) {

			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
	}
}
