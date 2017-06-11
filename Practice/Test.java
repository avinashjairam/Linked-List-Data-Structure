public class Test{
	public static void main(String [] args){
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);

		list.append(3);

		list.printList();

		list.insertAfter(list.head.next,1);
		list.printList();

		list.deleteNode(1);
		list.printList();
	}
}