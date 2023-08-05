

class Program10 {

	public static void main(String[] args) {
		
		int num = 2332;
		int temp = num;
		int rev = 0;
		for(; temp>0; temp/=10) {
			rev = rev*10 + temp%10;
		}
		if(rev == num)
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");

	}
}
