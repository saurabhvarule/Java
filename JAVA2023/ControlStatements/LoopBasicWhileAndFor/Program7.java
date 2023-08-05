
import java.util.*;
class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		for(int i=num ; i>0;) {

			if(num%2==0) {
				System.out.print(i + " ");
				i--;
			} else {
				System.out.print(i + " ");
				i -= 2;
			}
		}
		System.out.println();
	}
}
