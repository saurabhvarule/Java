

class RevSquare{

	public static void main(String [] args){

		for(int i=1;i<=4;i++){
			int var=i;
			for(int sp=3;sp<=i;sp--){
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++){
				System.out.print((var*var)+"");
				var--;
				}

				System.out.println();
		}
	}
}
