package linkedlist;

public class UC4_Class {
	public static void main(String[] args) {

		INode firstNode = new MyNode<Integer>(56);
		INode secondNode = new MyNode<Integer>(30);
		INode thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode, secondNode);
		myLinkedList.printNode();

	}
}
