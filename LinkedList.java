public class LinkedList{
	Node head; // head of the list

	public static void main(String [] args){
		LinkedList list = new LinkedList();

		list.head   = new Node(10);
		Node second = new Node(11);
		Node third  = new Node(12);
	
		list.head.next = second;
		second.next = third; 	

		list.printList();
	}

	public void printList(){
		Node n = head;

		while(n !=  null){
			System.out.println(n.data);
			n = n.next;
		}
	}


	
	
}