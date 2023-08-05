/*

class Demo1{

	public static void main(String[] args){

		int num=1;
		int j=1;
		for(int i=1;i<5;){
			
			if(j<i){
				
				System.out.print(num + " ");
				num++;
				j++;
				continue;


			}else if(j==i){

				System.out.print(num + " ");
				System.out.println();
				
				j=1;
				num=1;
				i++;
				
			}

				


		}
	}
}


*/


class PriDemo{

	private int x = 10;
	protected int y = 20;

	public static void main(String[] args){
		PriDemo obj = new PriDemo();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}


class Child extends PriDemo{
	
	Child(){

		
	}
	public static void main(String[] args){

		PriDemo obj1 = new Child();
		System.out.println(obj1.y);
		
	}

}
