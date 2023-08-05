

class Program10 {

	public static void main(String[] args) {
		int n = 6;
		
		for(int i=1; i<=n; i++) {
			char ch = 'F';
			int num = n;
			for(int j=1; j<=n; j++) {
				if(j%2==0)
					System.out.print(num + " ");
				else
					System.out.print(ch + " ");
				num--;
				ch--;
			}
			System.out.println();
		}
	}
}
