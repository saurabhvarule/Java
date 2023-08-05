

class Program3 {

	public static void main(String[] args) {
		int num = 942111423;
		int count = 0;
		for( ; num>0; count++,num/=10);
		System.out.println(count);
	}
}
