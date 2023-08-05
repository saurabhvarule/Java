

class InstanceVar{

	int x =10;

	{
		
		int y =20;
		System.out.println(y);
	}

	void m1(){
		
		int z =30;
		System.out.println(z);
	}

	public static void main(String[] args){
		
		InstanceVar obj =new InstanceVar();
		System.out.println(obj);
		System.out.println(obj.x);
		obj.m1();
	}
}
