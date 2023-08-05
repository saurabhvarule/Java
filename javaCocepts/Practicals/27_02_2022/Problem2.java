import java.util.*;

class Problem2{

	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter String to reverse ");
		
		String str1 = new String(obj.nextLine());
		
		char[] carr = str1.toCharArray();
		char[] ncr = str1.toCharArray();
		for(int i=(ncr.length - 1);i>=0;i--){
		 
			ncr[i]=carr[carr.length-1-i];

		}
		str1=new String (ncr);
		System.out.println(str1);
	}

}
