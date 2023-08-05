import java.util.*;

class StringDemo1{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		/*String str = "hello from Saurabh ";
		String str1 = new String("hello from Saurabh ");
		
		System.out.println(str==str1);
		*/
		System.out.println("Enter String 1 :");
		String str1 = sc.nextLine();

		System.out.println("Enter String 2 :");
		String str2 = new String(sc.nextLine());
		if(str1.equals(str2)){
		 	
			System.out.println(" String 1 is eual to string 2 ");
		}else{
		
			System.out.println(" Stirng 1 is not equal to String 2 ");

		}


	}
}
