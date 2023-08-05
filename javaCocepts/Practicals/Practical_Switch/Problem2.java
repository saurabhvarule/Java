
import java.util.*;
class Problem2{

	public static void main(String [] args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The Number");
		int x = obj.nextInt();
		switch(x){

			case 0:
				System.out.println(x + " = Zero");
				break;

			case 1:
				System.out.println(x + " = One");
				break;
			case 2:
				System.out.println(x + " = Two");
				break;
			case 3:
				System.out.println(x + " = Three");
				break;
			case 4:
				System.out.println(x + " = Four");
				break;
			case 5:
				System.out.println(x + " = Five");
				break;
			default:
				System.out.println("Printed Number is Greater Than 5");
				break;
		}
	}
}

