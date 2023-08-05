
import java.util.*;
class Problem1{

	public static void main(String [] args){

	
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter your English marks");
		float S1= obj.nextFloat();
		
		System.out.println("Eneter your Mathematics marks");
		float S2= obj.nextFloat();
		
		System.out.println("Eneter your Science marks");
		float S3= obj.nextFloat();
		
		System.out.println("Eneter your Social Science  marks");
		float S4= obj.nextFloat();

		System.out.println("Eneter your Sanskrit marks");
		float S5 = obj.nextFloat();

			if(S1>100 && S2>100 && S3>100 && S4>100 && S5>100){

				System.out.println("invalid Marks");
		
			}
			float t = S1+S2+S3+S4+S5;
			
			System.out.println("Your total marks are : "+(t));
						
	
			float t1=t;
			if (t1==500){
				System.out.println("yeahh boy! you earned out of marks ");

			}else if(t1>=450 && t1<500){
				System.out.println("Grade A ");
				
			}else if(t1>=400 && t1<=449){

				System.out.println("Grade B ");
			}else if(t1>=350 && t1<=399){

				System.out.println("Grade C ");
			}else if(t1>=300 && t1<=349){

				System.out.println("Grade D");				
			}else if(t1>500){

				System.out.println("Invalid Marks ");
			}
			else if(t1>=0 && t1<299){
				System.out.println("Arey Padhai Likhai Karo IAS YAS bano! *you failed in exam*");
			}else{
				System.out.println("Invalid Marks ");

			}
				

		
		 	

	}
}
