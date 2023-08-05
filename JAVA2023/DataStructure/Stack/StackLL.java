// implementation of stack using linked list :


import java.io.*;


class Stack {

	class Node {

		int data;
		Node next;
	}
	

	Node top;
	int count;
	
	// create node method :
	Node createNode(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		count++;
		return newNode;

	}

	// is empty method :
	boolean isEmpty() {

		if(top == null)
			return true;
		else
			return false;
	}
	
	// push method :
	void push(int data) {

		Node newNode = createNode(data);
		if(top == null) {

			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;

		}
	}

	// pop method :
	boolean flag = false;
	int pop() {

		if(isEmpty()) {

			System.out.println("Stack is Empty");
			flag = true;
			return -1;
		}
		int temp = top.data;
		top = top.next;
		count--;
		System.gc();
		return temp;
	}

	Node peek() {

		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return top;
	}

	public static void main(String[] args) {

		Stack obj = new Stack();
		obj.push(10);
		//obj.push(20);
		//obj.push(30);
		//obj.push(40);
		//obj.push(50);
		System.out.println(obj.peek().data);
		System.out.println(obj.count);
		System.out.println(obj.pop());

		Node popNode = obj.peek();
		if(popNode == null)
			System.out.println("Empty");
		else
			System.out.println(popNode.data);
	}
}
