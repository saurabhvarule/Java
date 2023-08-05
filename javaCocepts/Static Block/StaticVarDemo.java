


class StaticVarDemo{
	
	static int x;		//this will show bipush 10,putstatic field x; 
	

	static{
		
		int  y=20;	//in the byte code this will show bipush 20,istore0,this means scope y is limited for  the block.
		System.out.println(y);
	}

	StaticVarDemo(){

		x=15;		//this also dosent assign value to the static var x.bcause static vars are intilized in static block we are assigning its value in constructor,const only initilizes instance var.
//		y=20; 		:This doesnt work!! we can not assign value to variables in constructor, which are intialilzed in static block.
	}
	public static void main(String[] args){
		x=10;	
		System.out.println(x);



	}
	static{

		int z =30;		//in the byte code this will show bipush 30,istore0,this means scope y is limited for  the block.
		System.out.println(z);

	}

}
