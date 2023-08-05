
public class Numbers {

	// 1.Perfect Number
	public static void isPerfect(int num) {

		int sum = 1;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0)
				sum += i;
		}
		if(sum == num) 
			System.out.println(num + " is a Perfect Number");
		else
			System.out.println(num + " is not a Perfect Number");
	}
	// 2.Prime Number
	public static void isPrime(int num) {
		int flag = 0;
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				flag = 1;
				break;	
			}
		}
		if(flag == 0 && num>1) {

			System.out.println(num + " is a Prime Number");
		} else {

			System.out.println(num + " is not a Prime Number");
		}
	}
	// 3.Armstrong Number
	public static void isArmstrong(int real) {
		int num = real;
		int length = 0;
		int dup = num;
		for( ;num>0; num/=10,length++) {
		}

		int arr1[] = new int[10];
		arr1[0] = 0;
		arr1[1] = 1;
		for(int i=2; i<arr1.length; i++) {
			int power = i;
			for(int j=1;j<length; j++) {
				power = power * i;
			}
			arr1[i] = power;
		}
		int sum = 0;
		while(dup>0) {
			sum += arr1[dup%10];
			dup/=10;
		}
		if(real == sum) {

			System.out.println(real + " is an Armstrong number ");
		} else {

			System.out.println(real + " is not an Armstrong number ");
		}
	}

	// 4.Strong Number
	public static void isStrong(int num) {
		int dup = num;
		int arr1[] = new int[10];
		arr1[0] = 1;
		arr1[1] = 1;
		for(int i=2; i<arr1.length; i++) {
			int fact = 1;
			for(int j=2; j<=i; j++) {
				fact = fact*j;
			}
			arr1[i] = fact;
		}
		int sum = 0;
		while(dup>0) {
			sum += arr1[dup%10];
			dup/=10;
		}
		if(sum == num) {
			System.out.println(num + " is a Strong Number");
		
		} else {
			System.out.println(num + " is not a Strong Number");
		}
	}
	// 5.Palindrome
	public static void isPalindrome(int num) {

		int rev = 0;
		int dup = num;
		while(dup > 0) {

			rev = rev * 10 + dup % 10;
			dup /= 10;
		}
		if(rev == num) {

			System.out.println(num + " is a palindrome number");
		} else {

			System.out.println(num + " is not a palindrome number");
		}
	}

	// 6.Factorial
	public static void factorial(int num) {

		int fact = 1;
		for(int i=2; i<=num; i++) {

			fact *= i;
		}
		System.out.println("Facorial of " + num + " is " + fact);
	}

	// 7.Reverse
	public static void reverse(int num) {
		int dup = num;
		int rev = 0;
		while(dup > 0) {
			rev = rev * 10 + dup%10;
			dup /= 10;
		}
		System.out.println(num + " is now " + rev);
	}

	// main funtion :
	public static void main(String[] args) {
		
		//reverse(123456);
		//factorial(5);
		//isPalindrome(12321);
		//isStrong(145);
		isArmstrong(153);
		//isPrime(12);
		//isPerfect(6);

	}	
}
