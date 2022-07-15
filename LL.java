package javapackage3;

public class LL {
	Node head;
	
	void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}