// An automorphic number is an integer whose square ends with the given integer, as (25)2 = 625, and (76)2 = 5776.

class Automorphic {
	public static boolean isAutomorphic(int num) {
		int digitCount = 0;
		int temp1 = num;
		
		for(; temp1>0; digitCount++,temp1/=10);
		
		int sqr = num * num;
		int power = 10;
		for(int i = 1; i<digitCount; i++) {
			power *= 10;
		}

		if (num == (sqr % power))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {

		boolean res = isAutomorphic(7);

		if(res)
			System.out.println("Automorphic number");
		else
			System.out.println("Not Automorphic number");
	}	

}
