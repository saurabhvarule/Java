import java.util.*;

class ArrayDemo6{

	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter size of array :");
	int size = obj.nextInt();
	
	System.out.println("Enter Numbers :");
	int[] arr = new int[size];

	for(int i=0;i<size;i++){
		
		arr[i]=obj.nextInt();
	}
	System.out.println("Array Elements Are :");
	int max =0;
	int index =0;
	for(int i =0;i<size;i++){
		
		System.out.println(arr[i]);
	if(arr[i]>max){
			max = arr[i];
			index=i;
	}
		}
		System.out.println("Maximum value is : " + (max) + " and is at index :" + (index) );

	}	

}
