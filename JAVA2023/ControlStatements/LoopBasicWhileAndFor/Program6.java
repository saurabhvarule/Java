

class Program6 {

	public static void main(String[] args) {
		int sum = 0;
		int mult = 1;
		for(int i=1; i<=10; i++) {

			if(i%2==0)
				sum += i;
			else
				mult *= i;
		}
		System.out.println("Sum of all even numbers between 1 to 10 = " + sum);
		System.out.println("Multiplication of all odd numbers between 1 to 10 = " + mult);
	}
}
