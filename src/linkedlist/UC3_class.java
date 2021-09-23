package linkedlist;

public class UC3_class {
	public static void main(String[] args) {
		INode myFirstNode = new MyNode<Integer>(70);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(56);

		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.append(myFirstNode);
		myLinkList.append(mySecondNode);
		myLinkList.append(myThirdNode);
		myLinkList.printNode();
	}
}
