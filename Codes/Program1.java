

/*class Program1 {

	public static void main(String[] args) {
	
		for(int i=1; i<=50; i++) {
			int flag = 0;
			for(int j=2; j*j<=i; j++) {

				if(i%j==0) {
					flag =1;	
				}
			}
			if(flag == 0) {
				System.out.println(i);	
			}
		}
	}



class Main {

	public static void main(String[] args) {

		int arr1[] = new int[50];

		for(int i =2; i*i<arr1.length ; i++){	
			for(int j=i*i ; j<arr1.length; j+=i){
				arr1[j]=1;
			}
		}

		for(int i=2; i<arr1.length; i++) {

			if(arr1[i]==0) {	
				System.out.println(i);
			}
		}


	}	

}
