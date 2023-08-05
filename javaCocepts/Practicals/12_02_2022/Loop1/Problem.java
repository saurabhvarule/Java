import java.util.*;

class Problem1{

	public static void main(String[] args){
		

		int var = 1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = obj.nextInt();

		System.out.println("Enter a limit ");
		int y = obj.nextInt();
		
		
		
		for(int i=1; i<=y/x;i++){
			
			System.out.println(x*i);
		}
		
			
	}
	
}
