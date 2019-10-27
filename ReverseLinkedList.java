package leetcode.practice;

import java.io.IOException;

public class ReverseLinkedList {

    
	public static void main(String args[]) throws IOException
    {
		
		LinkedList llist = new LinkedList();
		for (int i = 1; i < 10; i++)
        {
            llist.addToTheLast(new Node(i));
        }
		llist.printList();
        
		llist.head = new ReverseLinkedList().reverseListIterative(llist.head);
		llist.printList();
        llist.head = new ReverseLinkedList().reverseListRecursive(llist.head);
        llist.printList();
        llist.head = new ReverseLinkedList().reverseListIterative(llist.head, 2);
		llist.printList();
    }

	private Node reverseListRecursive(Node head) {
		if (head == null || head.next == null) 
			return head;
		
		Node revesedNode = reverseListRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		return revesedNode;
		
	}

	private Node reverseListIterative(Node head) {
        Node prev = null; 
        Node next = null;
        Node curr = head;
		while (curr != null) {
		    next = curr.next;
		    curr.next = prev;
		    prev = curr;
		    curr = next;
		}
		return prev;
	}
	
	private Node reverseListIterative(Node head, int k) {
        Node prev = null; 
        Node next = null;
        Node curr = head;
        int count = 0;
		while (curr != null && count < k) {
		    next = curr.next;
		    curr.next = prev;
		    prev = curr;
		    curr = next;
		    count++;
		}
		
		if(next != null) {
			head.next = reverseListIterative(next, k);
		}
		return prev;
	}
}
