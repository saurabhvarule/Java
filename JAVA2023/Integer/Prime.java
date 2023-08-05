

class PrimeNumber {
	public static boolean isPrime(int num) {
		for(int i=2; i*i<=num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		boolean res = isPrime(7);
		if(res)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
