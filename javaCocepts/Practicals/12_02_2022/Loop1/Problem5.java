import java.util.*;


class Problem5{

	public static void main(String [] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter no of rows");

		int row = obj.nextInt();

		int num  = 1;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print(i*j +  " ");
						
				
				

			}
				System.out.println();
				num++;
		}
				
			
	}
}
