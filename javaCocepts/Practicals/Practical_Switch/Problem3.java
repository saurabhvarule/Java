import java.util.*;

class Problem3{

	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);

		System.out.println("Enter First Number");
		int x = obj.nextInt();
		System.out.println("Enter Second Number");
		int y = obj.nextInt();

			
		System.out.println();
		if(x>=0 && y>=0){

			int z = x*y;
			System.out.println(z);
			System.out.println();
			switch(z%2){
				case 1:
					System.out.println("The product of " + x + " and " + y + " is odd");
					break;
				default:	
					System.out.println("The product of " + x + " and " + y + " is even");
					break;
				
				
				}

			}else{

				System.out.print("Sorry Negative Numbers Are Not Allowed");
			}
		}


	}


