package adil.java.list;

class Node {

	Node next;
	int data;

	public Node(int x) {
		data = x;
		next = null;
	}

}

public class IntersectionOfList {

	static Node head1, head2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Linked List
		IntersectionOfList list = new IntersectionOfList();
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(15);

		// Creating second list

		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);
		list.head2.next.next.next = new Node(9);

		list.displayList(head1);
		System.out.println("Reverse First Linked List");
		head1=list.reverse(head1);
		System.out.println("After Reverse");
		list.displayList(head1);

		System.out.println("Second");

		list.displayList(head2);

		list.getNode();

	}

	private Node reverse(Node head) {
		// TODO Auto-generated method stub

		Node temp = head;
		Node prev = null, next = null;
		while (temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head=prev;
		return head;
	}

	private void getNode() {
		// TODO Auto-generated method stub
		int size1 = getCount(head1);

		int size2 = getCount(head2);

		int diff = Math.abs(size1 - size2);
		System.out.println("differrences=>" + diff);

		if (size1 > size2) {
			System.out.println(isIntersection(head1, head2, diff));
		} else {
			System.out.println(isIntersection(head2, head1, diff));
		}
	}

	private Boolean isIntersection(Node head1, Node head2, int diff) {
		// TODO Auto-generated method stub
		Node temp1 = head1;
		Node temp2 = head2;

		for (int i = 0; i <= diff; i++) {
			if (temp1 == null)
				return false;
			temp1 = temp1.next;
		}
		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				System.out.println(temp1.data + "----" + temp2.data);
				return true;
			}
			temp2 = temp2.next;
			temp1 = temp1.next;

		}
		return false;
	}

	private int getCount(Node head) {
		// TODO Auto-generated method stub
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	private void displayList(Node head) {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
