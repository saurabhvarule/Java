

class Program6 {

	public static void main(String[] args) {
		
		int num = 1;
		int n = 3;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(num*num + "  ");
				num++;
			}
			System.out.println();
		}
	}
}
