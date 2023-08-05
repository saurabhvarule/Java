

class Program2 {

	public static void main(String[] args) {

		int x = 10;
		{
			System.out.println(x);
		}
		{
			//int x = 15;	-->> error : variable int x is already defined 
			System.out.println(x);
		}

	}
}
