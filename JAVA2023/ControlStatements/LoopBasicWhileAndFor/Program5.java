

class Program5 {

	public static void main(String[] args) {
		int num = 942111423;
		for( ; num>0; num/=10) {
			if((num%10)%2==0) {
				System.out.print((num%10) *(num%10) + "\t");
			}
		}
		System.out.println();
	}
}
