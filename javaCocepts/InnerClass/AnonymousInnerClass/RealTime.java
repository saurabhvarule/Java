

class Activa{

	/*Activa(){

		System.out.println("In activa");
	}
	*/
	void Fc(){

		System.out.println("night at fc road");
	}


}

class Demo {
	public static void main(String[] args){

	Activa a = new Activa();
		
	new Activa(){

		void Bottle(){

			System.out.println(" Out of Petrol");
			System.out.println("Used bottle to fill petrol");
		}
	}.Bottle();
	a.Fc();

	}
	

}
