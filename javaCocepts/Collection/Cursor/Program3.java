

import java.io.*;
import java.util.*;

class Program3{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Vector v = new Vector();

		v.add("Yash");
		v.add("Harshal");
		v.add("Prajwal");
		v.add("Bhuvanesh");
		v.add("Saurabh");


		System.out.println("Search name ");
		try{

			String search = br.readLine();
			Enumeration obj = v.elements();
			int flag = 0;
			while(obj.hasMoreElements()){
			
				if(search.equals(obj.nextElement())){
					
					flag=1;		
				}
			}
			if(flag==1){
				System.out.println("Found");
			}else{

				System.out.println("Not Found");
			}
		
		}catch(IOException io){

		}


	}

}
