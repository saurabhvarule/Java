

class RevFour{

	public static void main(String [] args){

		int x=4;
		
		for(int i=1;i<=4;i++){
		int y = x;	

			for(int j=4;j>=i;j--){
		
				System.out.print(y + " ");
			   	y--;		
			}

				System.out.println();
				x--;
		}
	}
}
