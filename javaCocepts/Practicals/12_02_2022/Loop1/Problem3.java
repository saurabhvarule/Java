import java.util.*;

class Problem3{
	public static void main(String [] args){

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No Of Rows");
		int row = obj.nextInt();
	
		for(int i=1;i<=row;i++){
			char ch=64;
			ch+=row;
			for(int j=1;j<=row;j++){
				System.out.print(ch+ " ");
				ch--;
			}
				System.out.println();
		}
			
			

	}

}
