
import java.util.*;
class Problem2{

	public static void main(String [] args){

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No Of Rows");
		int row = obj.nextInt();
		
		int num =1;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if((num%2==0)){

					System.out.print(" "+num + "  ");
					num++;
				}else{
					System.out.print(num*num + "  ");
					num++;
		
				}
			}


					System.out.println();
		}

	}
}
