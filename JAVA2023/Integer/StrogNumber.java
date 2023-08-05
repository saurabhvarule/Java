/* 
	Strong number is a special number whose sum of the factorial of digits is equal to the original number. 
	For Example: 145 is strong number. Since, 1! + 4! + 5! = 145. 
*/
class StrongNumber {
	public static boolean isStrong(int num) {

		int arr1[] = new int[10];
		arr1[0] = 1;
		arr1[1] = 1;
		for(int i=2;i<arr1.length;i++) {
			int fact = i;
			for(int j=2; j<i; j++) {
				fact *= j;
			}
			arr1[i] = fact;
		}
		int temp = num;
		int sum = 0;
		while(temp>0) {
			sum = sum+arr1[temp%10];
			temp/=10;
		}
		if(sum == num)
			return true;
		else
			return false;
	}

	
	public static void main(String[] args) {
		boolean res = isStrong(245);

		if(res)
			System.out.println("Strong Number ");
		else
			System.out.println("Not a Strong Number");
	}
}
