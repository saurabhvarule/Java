

class Program7 {

	public static void main(String[] args) {
		int ch = 65;
		int n = 4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j%2==0)
					System.out.print((char)(ch+32) + " ");
				else
					System.out.print((char)ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
