

class Program3 {

	public static void main(String[] args) {
		int n = 4;
		int num = 13;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(num+j + " ");
			}
			num++;
			System.out.println();
		}
	}
}
