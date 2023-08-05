import java.io.*;

class Employee {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String nam1 = "A";
		String nam2 = "A";
		String ID1 = "A";
		String ID2 = "A";
		float sal1 = 00.0f;
		float sal2 = 00.0f;
		System.out.println("Enter Employee Info : ");
		for(int i=1;i<=2;i++){
			
			System.out.println("Enter Employee Name : ");
			String name = br.readLine();

			System.out.println("Enter Employee ID : ");
			String eid = br.readLine();

			System.out.println("Enter Salary : ");
			float salary = Float.parseFloat(br.readLine());
			
			switch(i){
				case 1:
					nam1 = name;
					ID1 = eid;
					sal1 = salary;
					break;
       				case 2:
					nam2 = name;
					ID2 = eid;
					sal2 = salary;
					break;
			}	

			}
		
			if(sal1>sal2){
			System.out.println("Name:" + nam1);
			System.out.println("Employee name :" + ID1);
			System.out.println("Salary :"+ sal1);
			
			} else{
			System.out.println("Name : " + nam2);
			System.out.println("Employee Id :" + ID2);
			System.out.println("Salary :" + sal2);
			
				}

			
		


	
	}
}
