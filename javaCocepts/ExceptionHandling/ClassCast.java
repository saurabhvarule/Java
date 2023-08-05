import java.io.*;

class Parent {
	Parent() {

		System.out.println("Parent Const");
	}

}

class Child  extends Parent {
	Child() {
		
		System.out.println("Child Const");

	}

}

class Demo {

	public static void main(String[] args) {


		Parent p = new Parent();
		
		Child c = new Child();
	
		p = c;
		
		Parent p1 = new Parent();
		try {

			br.readLine()
		}
		try{
			Child c1 = (Child)p1;
	
		}catch(ClassCastException cs){
			
			System.out.println(cs);
			cs.printStackTrace();

		}	

	}
}

