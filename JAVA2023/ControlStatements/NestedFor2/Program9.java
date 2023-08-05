

class Program9 {


	public static void main(String[] args) {
		int num1 = 1;
		int n = 3;
		for(int i=1; i<=n; i++) {
			int num2 = 3;
			char ch = 'C';
			for(int j=1; j<=n; j++) {
				System.out.print(num1*num1 +""+ch-- +""+ num2-- + "  ");
				num1++;
			}
			System.out.println();
		}
	}
}
