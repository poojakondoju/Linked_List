package linkedlist;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * Insert elements in reverse order
	 */
	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			// swapping numbers
			INode temp = head;
			this.head = node;
			this.head.setNext(temp);
		}
	}

	/*
	 * Printing the linked list elements
	 */
	public void printNode() {
		StringBuilder nodes = new StringBuilder("Node keys: ");

		INode temp = head;
		while (temp != null) {
			nodes.append(temp.getKey());
			if (temp != tail) {
				nodes.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(nodes);
	}

	/*
	 * Insert elements in a order
	 */
	public void append(INode newNode) {

		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/*
	 * Insert elements in a order
	 */
	public void insert(INode myNode, INode newNode) {
		INode temp = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(temp);
	}

	/*
	 * pop method will delete the first element in the linked list.
	 */
	public INode pop() {
		INode node = this.head;
		this.head = head.getNext();
		return node;
	}

}