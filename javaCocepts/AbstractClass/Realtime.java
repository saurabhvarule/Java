

abstract class Vehicle{

	void BodyStructure(){

		System.out.println("All Car Body Structure ");
	}
	abstract void engine();
}
class FuelVehicle extends Vehicle{

	void engine(){


		System.out.println("Fuel Engine petrol/diesel");
	}
}
class ElectricVehicle extends Vehicle{

	void engine(){

		System.out.println("Electric Engine");
	}
}
class Main{

	public static void main(String[] args){
		
		Vehicle f = new FuelVehicle();
		f.BodyStructure();
		f.engine();
		Vehicle e = new ElectricVehicle();
		e.engine();


	}
}
