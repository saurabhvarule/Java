import java.io.*;

class ArrayDemo9{

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println(" Arrays ");
	System.out.println("1.Integer Array ");
	System.out.println("2.Character Array ");
	System.out.println("3.Stirng Array ");
	System.out.println("4.Exit ");
	System.out.println();
	System.out.println("Select Your Option ");
	int option = Integer.parseInt(br.readLine());
		do{
		switch(option){

			case 1:
				System.out.println("Integer Array");
				System.out.println("Enter Array Size");
				
				int size1 = Integer.parseInt(br.readLine()); 
	
				int [] arr1 = new int [size1];
				for(int i=0;i<size1;i++){
					arr1[i]=Integer.parseInt(br.readLine());

				}
				System.out.println("Your Integer Array is : ");
				for(int i=0;i<size1;i++){
					System.out.println(arr1[i] + " ");
				}

			break;
			
			case 2:
				System.out.println("Character Array ");
				System.out.println("Enter Array Size :");
				
				int size2 = Integer.parseInt(br.readLine());
	
				char [] ch = new char[size2];
				
				System.out.println();	
				for(int i =0;i<size2;i++){
					ch[i] = (char)br.read();
					br.skip(1);
				}
				System.out.println("Your Character Array is : ");
				for(int i=0;i<size2;i++){
					System.out.println(ch[i] + " ");
				}
			break;
	
			case 3:
				System.out.println("String Array :");
				System.out.println("Enter Array Size");
				
				int size3 = Integer.parseInt(br.readLine());

				String[] str = new String[size3];
				
				System.out.println();
				for(int i =0;i<size3;i++){
					str[i]=br.readLine();
				}
				System.out.println("Your String Array is : ");
				for(int i =0;i<size3;i++){
					System.out.println(str[i] + " ");
				}
				break;

			default :
				System.out.println("Exited,Thank You");
				break;
			}
	
		
				System.out.println(" Arrays ");
				System.out.println("1.Integer Array ");
				System.out.println("2.Character Array ");
				System.out.println("3.String Array ");
				System.out.println("4.Exit");
				System.out.println();
				System.out.println("Select Your Option ");
				option=Integer.parseInt(br.readLine());
				
		}while(option<4);
		
	}	
}
