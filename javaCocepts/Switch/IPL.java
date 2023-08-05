import java.util.*;

class IPL2022{

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("TATA IPL 2022 ");
		char choice;
		do{	
			
			System.out.println("WELCOME TO IPL 2022 ");
			System.out.println();
			System.out.println("1.Mumbai Indians ");
			System.out.println("2.Royal Challengers Banglore ");
			System.out.println("3.Sun Risers Hydrabad ");
			System.out.println("4.Delhi Capitals ");
			System.out.println("5.Punjab Kings ");
			System.out.println("6.Chainnai Super Kings ");
			System.out.println("7.Rajasthan Royals");
			System.out.println("8.Kolkatta Knight Riders");
			System.out.println("9.Gujarat Titans");
			System.out.println("10.Lakhnow Super Giants");
			System.out.println();

			System.out.println("Enter Player Name : ");
			String pName=obj.nextLine();

			System.out.println();
			System.out.println("Enter Amount");
			
			int mi = obj.nextInt();//1
			int rcb = obj.nextInt();//2
			int srh = obj.nextInt();//3
			int dc = obj.nextInt();//4
			int pbks = obj.nextInt();//5
			int csk = obj.nextInt();//6
			int rr = obj.nextInt();//7
			int kkr = obj.nextInt();//8
			int gt = obj.nextInt();//9
			int lsg = obj.nextInt();//10

			int ch=0;
			int[] arr = new int[10];
			arr[0] = mi;
			arr[1]=rcb;
			arr[2]=srh;
			arr[3]=dc;
			arr[4]=pbks;
			arr[5]=csk;
			arr[6]=rr;
			arr[7]=kkr;
			arr[8]=gt;
			arr[9]=lsg;
			
			int max =0;
			for(int i=0;i<10;i++){
				if(arr[i]>max){
					max=arr[i];
					ch=i;
				}

				
			}

			switch(ch){
						
				case 0 :		
					System.out.println(pName + " Sold to Mumbai Indians :");
					break;	

				case 1 :		
					System.out.println(pName + " Sold to Royal Challengers Banglore :");
					break;	

				case 2 :		
					System.out.println(pName + " Sold to Sunrisers Hydrabad ");
					break;	
				case 3 :		
					System.out.println(pName + " Sold to Delhi Capitals ");
					break;	
				case 4 :		
					System.out.println(pName + " Sold to Punjab Kings ");
					break;	
				case 5 :		
					System.out.println(pName + " Sold to Chennai Super Kings ");
					break;	
				case 6 :		
					System.out.println(pName + " Sold to Rajashthan Royals ");
					break;	
				case 7 :		
					System.out.println(pName + " Sold to Kolkatta Knight Riders ");
					break;	
				case 8:		
					System.out.println(pName + " Sold to Gujarat Titans ");
					break;	
				case 9 :		
					System.out.println(pName + " Sold to Lakhnow Super Kings ");
					break;	
				default:
					System.out.println(pName + " Going to Be Unsol For IPL 2022 ");
					break;
			}
			System.out.println("Do You Want To Continue ? ");
			System.out.println("Press 'Y' to continue ");
			choice  = obj.next().charAt(0);	
			obj.skip("\n");


		}while(choice == 'y' || choice == 'Y');


	}

}
