public class LinkedList{
	Node head; // head of the list

	public static void main(String [] args){
		LinkedList list = new LinkedList();

		
		list.append(6);
		list.push(7);

		list.printList();

		list.push(1);
		list.append(4);

		list.printList();
		//insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL

		list.insertAfter(list.head.next, 8);	

		list.printList();
		list.push(3);
		list.printList();

		list.deleteNodeAtPosition(2);
		list.printList();
	}

	public void printList(){
		Node n = head;
		System.out.println();
		while(n !=  null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	//This method inserts a node at the head of the list 
	public void push(int data){
		//Create the new node and allocate the data
		Node newNode = new Node(data);

		//Set the next pointer of the new node to the current head
		newNode.next = head;

		//Make the new node the head of the list
		head = newNode;
	}

	//This method inserts a node after a particular node
	public void insertAfter(Node prevNode, int data){
		//Check if a previous node is null
		if(prevNode == null){
			System.out.println("The previous node cannot be null");
			return;
		}

		Node newNode = new Node(data);

		//Make the next of the newNode the next of the prevNode
		newNode.next = prevNode.next;

		//Set the next of the prevNode to the newNode
		prevNode.next = newNode;
	}

	public void append(int data){
		Node newNode = new Node(data);

		//If the list is empty make the newNode the head
		if(head == null){
			head = new Node(data);
			return;
		}

		//The new node is going to be the last one so make its next null

		newNode.next = null;

		//Else traverse till the last node

		Node last = head;

		while(last.next != null){
			last = last.next;		
		}

		//change the next of the last node
		last.next = newNode;
	}

	//Given a key delete the first occurence of a key in that list 
	public void deleteNode(int key){
		//Store the head node
		Node temp = head, prev = null;

		//If the head node itself holds the key to be deleted
		if(temp != null && temp.data == key){
			head = temp.next; // changed head
		}

		//Search for the key to be deleted, keep track of the previous node as we need to change temp.next
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}

		//if key was not present in linked list
		if(temp == null){
			return;
		}

		//unlink the node from the linked list
		prev.next = temp.next;
	}

	public void deleteNodeAtPosition(int position){
		//If the linked list is empty
		if(head == null){
			return;
		}

		//Store node head
		Node temp = head;

		//If the head needs to be removed
		if(position == 0){
			head = temp.next; //change head
			return; 
		}

		//Find the previous node of the node to be deleted
		for(int i = 0; temp != null && i < position - 1; i++){
			temp = temp.next;
		}

		//If the position is more than the number of nodes
		if(temp == null || temp.next == null){
			return;
		}

		//Node temp-next is the node to be deleted
		//Store the pointer to the next of the node to be deleted 
		Node next = temp.next.next;
		temp.next = next;


	}
	
	
}