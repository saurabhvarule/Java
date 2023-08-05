/*
 	An Armstrong number is one whose sum of digits raised to the power three equals the number itself. 371, 
	for example, is an Armstrong number because 3**3 + 7**3 + 1**3 = 371.

*/

class Armstrong {
	
	public static boolean isArmstrong(int num) {
		int length = 0;
		int temp1 = num;
		int temp2 = num;
		for( ; temp1>0;length++,temp1/=10);
		
		int arr1[] = new int[10];
		arr1[0] = 0;
		arr1[1] = 1;
		for(int i=2;i<arr1.length; i++) {
			int power = i;
			for(int j=1; j<length; j++) {

				power *= i;
			}
			arr1[i] = power;
		}
		int sum = 0;
		while(temp2>0) {
			sum += arr1[temp2%10];
			temp2 /= 10;
		}
		if(sum == num)
			return true;

		return false;

	}
	public static void main(String[] args) {
		boolean res = isArmstrong(1634);
		if(res == true)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
