import java.io.*;

class Node {

	int data;
	Node next;
}

class LinkedList {
	
	Node head;
	int count;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 1.create node method :
	public Node createNode(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		count++;
		return newNode;	
	}

	//2.add node method :
	public void addNode(int data) {
		
		Node newNode = createNode(data);
		if(head==null) {
			head = newNode;
			newNode.next = null;
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;

			}
			temp.next = newNode;
			//newNode.next = null;
	}
}
	// 3. printi linked list method :
	public int printLinkedList() {

		if(head == null) {
			System.out.println("Empty");
			return -1;
		} else {

			Node temp = head;
			while(temp.next !=null) {
				System.out.print("|" +temp.data + "|->" );
				temp = temp.next;
			}
			System.out.print("|" + temp.data + "|\n" );

			return 0;
		}
	}
	
	// 4.add first method :
	public void addFirst(int data) {

		Node newNode = createNode(data);
		newNode.next = head;
		head = newNode;

	}

	// 5. add last method :
	public void addLast(int data) {

		addNode(data);

	}
	
	// 6.add at position method :
	public int addAtPos(int data) throws IOException{
		
		System.out.println("enter position");
		int pos = Integer.parseInt(br.readLine());

		if(pos <= 0 || pos > count+1) {
			System.out.println("Invalid Position");
			return -1;
		} else {

			if(pos == 1) {

				addFirst(data);
			} else if(pos == count+1) {

				addNode(data);
			} else {
				Node newNode = createNode(data);
				Node temp = head;
				while(pos>2) {
					temp = temp.next;
					pos--;
				}
				newNode.next = temp.next.next;
				temp.next = newNode;

			}
			return 0;
		}


	}
	
	// 7.delete first node funtion :
	public int deleteFirst() {
		if(head == null) {
			System.out.println("linked list is empty");
			return -1;
		}
		head = head.next;
		count--;
		return 0;
	}
	// 8.delete last node method :
	public int deleteLast() {
		if(head == null) {

			System.out.println("Linked list is empty");
			return -1;
		}
		Node temp = head;
		while(temp.next.next != null) {

			temp = temp.next;
		}
		temp.next = null;
		count--;
		return 0;
	}

	// 9.delete at position method :
	public int deleteAtPos() throws IOException{
		System.out.println("Enter position");
		int pos = Integer.parseInt(br.readLine());
		if(pos<=0 || pos>count) {
			System.out.println("Invalid position");
			return -1;
		} else {

			if(pos == 1) {
				deleteFirst();
			} else if(pos ==  count) {

				deleteLast();
			} else {
				Node temp = head;
				while(pos>2) {
					temp = temp.next;
					pos--;
				}
				temp.next = temp.next.next;
				count--;
			}
			return 0;
		}
	}

}

class Main {

	
	public static void main(String[] args) throws IOException{
		LinkedList ll = new LinkedList();
		
		ll.addNode(10);
		ll.addNode(20);
		ll.addNode(30);
		ll.addNode(40);
		ll.addNode(50);

		ll.addFirst(60);
		ll.addLast(70);

		//ll.addAtPos(80);
		ll.printLinkedList();
		ll.deleteFirst();

		ll.printLinkedList();
		ll.deleteLast();
		ll.printLinkedList();
		
		ll.deleteAtPos();
		ll.printLinkedList();
	}
}
