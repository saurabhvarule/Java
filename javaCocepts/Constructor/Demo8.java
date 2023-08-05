

class Demo8{
	int x =100;
	Demo8(){
	//	super();  error
		this(1);
		System.out.println("in const");
	//	this(10);  //error: call to this must be declare first in const
		System.out.println(x);
	}
	Demo8(int x){
		this.x=30;
		System.out.println("In int ");
		System.out.println(this.x);

	}

	public static void main(String[] args){

		Demo8 obj1 = new Demo8();	//this will print "in cons"
		//now we creating onother obj to call para const

		//Demo8 obj2 = new Demo8(10);
		//obviously it will print  "In int"
		//but if we want call onother const just by creating single object we have to write this(10) this will call para const without creating onother obj

	}
}
