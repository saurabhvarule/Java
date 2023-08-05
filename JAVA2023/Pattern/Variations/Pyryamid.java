

import java.util.Scanner;
class Pyryamid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int row = sc.nextInt();

		for(int i=0; i<row; i++) {

			for(int j=0; j<row-(i+1); j++) {

				System.out.print("  ");
			}
			for(int k=0; k< 2*i+1; k++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
