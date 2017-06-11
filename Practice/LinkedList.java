public class LinkedList{
	Node head;


	public LinkedList(){
		this.head = null;
	}

	//Time complexity is O(1)
	public void push(int data){
		Node temp = new Node(data);
		temp.next = head;
		head = temp; 
	}

	//Appends New Node at the end of the list
	public void append(int data){
		Node temp = new Node(data);

		//If the linked list is empty then make the new node the head
		if(head == null){
			head = new Node(data);
			return;
		}

		//Otherwise find the last node in the list
		Node last = head;

		while(last.next != null){
			last = last.next;
		}
		
		last.next = temp;
		return;
	}

	//Inserts a new node after a given previous Node
	public void insertAfter(Node prev, int data){
		Node temp = new Node(data);

		//Check if the list is empty
		if(head == null){
			System.out.println("The given previous node cannot be null");
			return; 
		}

		temp.next = prev.next;
		prev.next = temp;

	}

	//Printing the linked list
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	//Deletes the first occurence of a key in a linked list
	public void deleteNode(int key){
		//Store head node
		Node temp = head, prev = null;

		//Check to see if the head itself is the node to be deleted
		if(temp != null && head.data == key){
			head = temp.next;
			return;
		}

		//Otherwise find the previous node

		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}

		//If the key is not found, return
		if(temp == null){
			return;
		}

		//Unlink the node to be deleted from the link list
		prev.next = temp.next;
	}
}