

class Main {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		
		int flag = false;
		int index = 0;
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str1.length();) {
				if(i==j){
					j++;
				}else if(str1.charAt(i) == str1.char(j) && j==i+1){
					flag = true;
					index = j;
				}
				j++;

			}
			if(flag == true) {
				System.out.println("Duplicate element found at " + index);
			}else {

				System.out.println("No duplicate element in string ");
			}
		}
	}
}
