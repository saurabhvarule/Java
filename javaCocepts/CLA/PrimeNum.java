

class PrimeNum {

	public static void main(String[] args) {
		
		int flag = 0;
		int a  = Integer.parseInt(args[0]);
		
		for (int i = 2; i < a; i++) {
			
			if (a % i == 0 )
				flag = 1;	
			
		}
		
		if (flag > 0 || a == 1){
		
			System.out.println(a + " is a not Prime number ");
		}else{
		
			System.out.println(a + " is a prime number ");
		}	
		

	}
}
