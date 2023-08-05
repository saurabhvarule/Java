import java.util.*;

class Saurabh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Thread t = new Thread();
		System.out.println("enter the length of rows ");
		int row = 0;
		try {
			row = sc.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println(ime);
		}
		String[][] arr = new String[row][row];
		sc.skip("\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.println("enter anything :");
				arr[i][j] = sc.nextLine();

			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				try {
					System.out.print(arr[i][j] + " ");
					t.sleep(500);
				} catch (InterruptedException it) {

				}
			}
			System.out.println();
		}

		System.out.println("end main");
	}	
}
