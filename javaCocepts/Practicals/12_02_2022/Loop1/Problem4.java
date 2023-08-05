import java.util.*;


class Problem4{

	public static void main(String [] args){

		Scanner obj = new Scanner (System.in);
		System.out.println("Enter no of rows : ");

		int row = obj.nextInt();
		int num=0;
		int num2=1;
		int i=1;
		while(i<=row){

			
			int j=1;
			while(j<=i){

				if(j%2==0){
				System.out.print(num + " ");
				}else{System.out.print(num2 + " ");
				}

				

				j++;
			}
			
				System.out.println();			
			
				i++;

		}
				row++;
		}
	}

