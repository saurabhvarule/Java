import java.util.*;

class Problem1{

	public static void main(String []args){
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter size of array ;");
		int size = obj.nextInt();

		System.out.println("Enters names in array :");
		String[] str1 = new String[size];

		for(int i=0;i<str1.length;i++){

			str1[i]=obj.next();
			obj.skip("\n");
		
		}

		System.out.println("Enter name to search :");
		String search = obj.nextLine();	

		for(int i=0;i<str1.length;i++){
		
			if(search.equalsIgnoreCase(str1[i])){
			
			System.out.println("String " + search + " at index " + (i));
			break;
			}
			
		}

	}

}
