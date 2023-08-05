/*
	A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number (such as 16461) th	at remains the same when its digits are reversed. In other words, it has reflectional symmetry across a vertical 	axis.The term palindromic is derived from palindrome, which refers to a word (such as rotor or racecar) whose 		spelling is unchanged when its letters are reversed. The first 30 palindromic numbers (in decimal) are:    
	0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 1	91, 202, …

*/


class Palindrome {

	public static boolean isPalindrome(int num) {

		int temp = num;
		int rev = 0;
		while(temp>0) {
			rev = rev * 10 + temp%10;
			temp/=10;
		}
		if(rev == num)
			return true;
		
		return false;
	}
	public static void main(String[] args) {

		boolean res = isPalindrome(101);
		if(res)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}
}
