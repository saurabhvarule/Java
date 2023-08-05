

class profitLoss{

	public static void main(String [] args){

		int sp=300;
		int cp=500;
		if(sp>cp){						
			int profit=sp-cp;
		 	System.out.println("Profit of : "+ profit);
		}else if(cp>sp){

			int loss=cp-sp;
		 	System.out.println("Loss of : "+ loss);

		}else if(cp==sp){

		 	System.out.println("Profit of : 0");


		}


	}
}
