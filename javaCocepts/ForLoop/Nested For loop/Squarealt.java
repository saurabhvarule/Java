

class SquareAlt{

	public static void main(String [] args){

		int num = 1;
			for(int i=1;i<=3;i++){

				for(int j =1; j<=3;j++){

					if((i+j)%2==0){

						System.out.print(num + " ");						
					}else{

						System.out.print((num*num) + " ");
						
					}
						num++;

				}
						System.out.println();
			}
		}
}

