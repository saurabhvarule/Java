

import java.io.*;

public class SortWords {

	public void sortWords(String name){

		System.out.println("Before sort :" + name);
		
		char[] temp = name.toCharArray();

		for(int i = 0;i<name.length();i++) {
			int j;
			for(j = i+1; j<name.length(); j++) {
				if(temp[j] < temp[i]) {
					char dup = temp[i];
					temp[i] = temp[j];
					temp[j] = dup;
				}
				
			}
		}
		
		name = String.valueOf(temp);
		System.out.println("After sort :"+ name);
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SortWords sw = new SortWords();

		String name ="";
		System.out.println("Enter a name to sort");
		try{
			name = br.readLine();

		}catch(IOException io) {

		}

		sw.sortWords(name);
	}

}
