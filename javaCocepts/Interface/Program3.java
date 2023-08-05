

interface Mobile{

	class Redmi{

		void Processor(){

			System.out.println("Snapdragon 650");
		}

	/*	public static void main(String[] args){
			Redmi r = new Redmi();
			r.Processor();

		}*/


	}
}

class RedmiNote7pro implements Mobile{
		
	public static void main(String[] args){
		
		Redmi obj = new Redmi();
		obj.Processor();
	}
}

