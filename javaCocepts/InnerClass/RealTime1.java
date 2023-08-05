

class India{

	int x =10;
	static int y =20;

	static{
		System.out.println("Prime Minister Of India");
	}

	India(){

		System.out.println("President Of India");

	}

	India(int x){

		System.out.println("Other Central Minister");

	}

	static void IndianRailways(){

		System.out.println("Indian Railways for all Indian citizens ");


	}

	private void Defence(){

		System.out.println("Defence System of India");
		System.out.println(x);
		System.out.println(y);

	}

	


	class Maharashtra extends India{

		int x=30;


		Maharashtra(){

			System.out.println("Chief Minister");

		}
		
		Maharashtra(int x){
			System.out.println("Other State Ministers ");

		}

		void MSRTC(){

			System.out.println("MSRTC for Maharashtra State Citizens");
			System.out.println(x);
			System.out.println(India.this.x);
			System.out.println(y);

		}
		
		 

	}

	public static void main(String[] args){

		India I = new India();
		India I1 = new India(10);
		India.IndianRailways();
		I.Defence();
		India.Maharashtra M = I.new Maharashtra();
		India.Maharashtra M1 = I.new Maharashtra(10);
		M.MSRTC();
	  	M.IndianRailways();
	

	}
}
