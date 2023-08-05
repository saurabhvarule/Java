

class HotelSukhsagar{

	public static void main (String [] args ){

		System.out.println("1.Veg");
		System.out.println("2.Non veg");

			int choise=2;
			switch(choise){

				case 1:{
					System.out.println("1.Paneer angara");
					System.out.println("2.veg patiyala");
					System.out.println("3.paneer masala");

					int ch1=3;
					switch(ch1){

						case 1:
							System.out.println("order : panner angara");
							break;
						case 2:
							System.out.println("order : Veg patiyala");
							break;
						case 3:
							System.out.println("order : Paneer masala");
							break;
						default:
							System.out.println("Nahi havaye kahii");
							break;
					}					
				break;	
				}

				case 2:{
					       System.out.println("1.Chicken tilkkaa");
					       System.out.println("2.Chiken Malavani");
					       System.out.println("3.Chicken maharaja");

					       int ch2=2;
					       switch(ch2){

						       case 1:
							       System.out.println("Order : Chiken Tikkaa");
							       continue;
			 	 		       case 2:
							       System.out.println("order :chiken Malvani");
							       break;
						       case 3 :
							       System.out.println("Order : Chicken Maharaja");
							       break;
						       default:
							       System.out.println("Nahi hav aahe kahi ");
							       break;
					        	      
					       }



				break;	       
				}
				default:
			                System.out.println("Ith tumhala jaga nahi!!");

			}



	}




}
