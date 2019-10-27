package leetcode.practice;

public class Merge2Lists {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addToTheLast(new Node(1));
		l1.addToTheLast(new Node(2));
		l1.addToTheLast(new Node(4));

		LinkedList l2 = new LinkedList();
		l2.addToTheLast(new Node(1));
		l2.addToTheLast(new Node(3));
		l2.addToTheLast(new Node(4));
		
		LinkedList l3 = mergeLists(l1.head, l2.head);
		
		l3.printList();
	}
	
	public static LinkedList mergeLists(Node l1, Node l2) {
		LinkedList l3 = new LinkedList();
		
		
		if(l1 == null) l3.addToTheLast(l2);
		else if(l2 == null) l3.addToTheLast(l1);
		
		
		else if(l1.data < l2.data) {
			l3.addToTheLast(l1);
			l3 = mergeLists(l1.next, l2);
		}else {
			l3.addToTheLast(l2);
			l3 = mergeLists(l1, l2.next);
		}
		
		return l3;
		
	}

}
