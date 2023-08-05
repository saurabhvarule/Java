import java.io.*;

class JavaStack {

	static int top = -1;
	static int size;
	static boolean flag = false;
	// isFull method
	boolean isFull() {

		if(size-1 == top)
			return true;
		else
			return false;
	}
	// isEmpty method
	boolean isEmpty() {

		if(top == -1)
			return true;
		else
			return false;
	}
	// 1. push
	int push(int stack[],int val) {	
		top++;
		if(isFull()) { 
			System.out.println("stack is full");
			return -1;
		}
		stack[top] = val;
		return 0;
		
	}
	//2. pull
	int pull(int stack[]) {
		int data = -1;
		if(isEmpty()) {
			System.out.print("stack is empty");
			flag = true;
			return data;
		}
		data = stack[top];
		top--;

		return data;	
	}
	int printStack(int stack[]) {
		if(isEmpty()) {

			System.out.println("stack is empty ");
			return -1;
		}
		for(int temp = top; temp>=0; temp--) {

			System.out.println("| " + stack[temp] + "|");
		}
		return 0;
	}


	// main method
	public static void main(String[] args) throws IOException  {
		JavaStack obj = new JavaStack();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter size of stack :");
		size = Integer.parseInt(br.readLine());

		int stack[] = new int[size];
		int val;
		char option;
		int choise;
		int retVal;
		do {
			System.out.println("1.push");
			System.out.println("2.pull");
			System.out.println("3.print stack");
			System.out.println("4.count");
			
			System.out.println("\nselect your option");
			choise = Integer.parseInt(br.readLine());
			switch(choise) {
				case 1:
					System.out.println("enter value :");
					val = Integer.parseInt(br.readLine());
					obj.push(stack,val);
					break;
				
				case 2:
					retVal = obj.pull(stack);
					if(flag == false)
					       System.out.println(retVal);
					
					flag = false;
					break;
				
				case 3:
					retVal = obj.printStack(stack);
					break;
				case 4 :
					System.out.println(top);
					break;
				default:
					System.out.println("Wrong Option");

			}

			System.out.println("do you want to continue? [Y/y,N/n]");
			option = (char)br.read();
			br.skip(1);
		}while(option == 'y' || option == 'Y');

	}
}
