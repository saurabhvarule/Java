// String to Integer ;

class StringtoNum {

	static int strtoNum(char ch) {
			
			switch(ch) {
				case '0' :
					return 0;
				case '1' :
					return 1;
				case '2' :
					return 2;
				case '3' :
					return 3;
				case '4' :
					return 4;
				case '5' :
					return 5;
				case '6' :
					return 6;
				case '7' :
					return 7;
				case '8' :
					return 8;
				case '9' :
					return 9;
			}
		
		return 0;
	}
	public static void main(String[] args) {
		String str = "12345789";
		System.out.println(str);
		int num =0;
		for(int i=0; i<str.length(); i++) {
			
			num = num * 10 + strtoNum(str.charAt(i));
		}
		System.out.println(num);
	}
}
