

import java.util.*;

class Pyryamid2 {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int row = sc.nextInt();

		for(int i=0; i< row; i++) {
			for(int j=0; j<row-i; j++) {

				System.out.print(" ");
			}
			for(int k = 0; k<2*i+3; k++) {
				if(k==i+1) {
					System.out.print("  ");
				}else {

					System.out.print("#");
				}
			}
			System.out.println();
		
		}
	}
}
