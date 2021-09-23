package linkedlist;


public class UC2Class {
	public static void main(String[] args) {
		INode myFirstNode = new MyNode<Integer>(70);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		
		myLinkList.printNode();
	}
}
