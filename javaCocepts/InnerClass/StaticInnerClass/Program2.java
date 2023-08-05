

class Hospital{

	int x =10;
	static int y =20;
	 

	static class Doctor{

		int a = 30;
		static int b =40;

		void Private(){

//			System.out.println(x);
			System.out.println(y);
			System.out.println(a);

			System.out.println(b);
		}
		
	}

	void Gov(){

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args){

		Doctor d = new Doctor();
		d.Private();
		Hospital h = new Hospital();
		h.Gov();
	}
}
