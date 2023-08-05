/*
 	In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
	For instate, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.

*/

class Perfect {
		
	
	public static boolean isPerfect(int num) {

		int sum = 1;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0)
				sum += i;
		}
		if(sum == num) 
			return true;
		else
			return false;
	}
	public static void main(String [] args) {
		
		boolean res = isPerfect(6);
		if(res)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");

	}
}
