package javapackage3;

public class LL {
	Node head;
 Node tail;
    int size;

    public void addFirst(int data) {
        Node t = new Node(data);
        t.data = data;
        t.next = head;
        if (size == 0) {
            tail = t;
        }
        head = t;
        size++;
    }
	
	void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
