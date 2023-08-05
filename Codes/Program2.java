

class Program2 {
	
	public static int[] primeArray(int arr1[]) {
	

		for(int i=2; i*i<arr1.length; i++) {
			for(int j=i*i; j<arr1.length; j+=i) {
				if(arr1[j]==0)
					arr1[j] = 1;
			}
		}

		return arr1;
	}

	public static void main(String[] args) {

		int arr1[] = new int[100];
		primeArray(arr1);
		for(int i=2; i<arr1.length; i++) {
			if(arr1[i] == 0) {
				System.out.println(i);
			}
		}

	}	
}
