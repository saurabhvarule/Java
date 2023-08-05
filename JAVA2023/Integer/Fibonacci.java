/*
	The Fibonacci numbers are the numbers in the following integer sequence.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

	In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation .

*/
class Fibonacci {
	public static void fibonacci(int num) {

		int a = 0;
		int b = 1;
		int sum = 0;
		while(sum<num) {
			System.out.print(sum + "\t");
			a = b;
			b = sum;
			sum = a + b;
		}
		System.out.println();
	}
	public static void main(String[] args) {

		fibonacci(10);
	}
}
