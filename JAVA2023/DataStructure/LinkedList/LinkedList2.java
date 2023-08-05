
class LinkedList {


	class Node {

		int data;
		Node next;
	}

	Node head;
	public Node createNode(int data) {

		Node newNode = new Node();
		newNode.data = data;
		return newNode;
	}

	public void addNode(int data) {

		Node newNode = createNode(data);
		if(head == null) {
			head = newNode;
		} else {

			Node temp = head;
			while(temp.next != null) {

				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int printLL() {

		if(head == null) {

			System.out.println("linked list is empty");
			return -1;
		}
		Node temp = head;
		while(temp.next != null) {

			System.out.print("|" + temp.data + "|->");
			temp = temp.next;
		}
		System.out.print("|" + temp.data + "|\n");
		return 0;
	}


	// main method :
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addNode(10);
		ll.addNode(20);
		ll.addNode(30);
		ll.addNode(40);
		ll.addNode(50);
		ll.printLL();
	}	
}
