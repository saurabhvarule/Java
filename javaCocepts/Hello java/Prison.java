


class Prison {

	int jailer = 10;
	static int guard = 20;
	
	public void cell() {
		
		System.out.println("In cell");

	}
	public static void prisonYard(){
		
		System.out.println("In prison yard");
		
	
	}
	public static void main (String [] args){

		System.out.println(guard);
		prisonYard();

		Prison obj = new Prisown();

		obj.cell();
		System.out.println(obj.jailer);
	}



}
