

class Program4 {

	public static void main(String[] args) {
		int num = 942111423;
		int count = 0;
		for( ;num>0; num/=10) {
			if((num%10)%2!=0) {
				count++;
			}
		}
		System.out.println("count of odd digits is = " + count);
	}
}
