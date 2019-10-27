package leetcode.practice;

import java.io.PrintWriter;

public class LinkedList {
	    Node head;  // head of lisl
	    Node lastNode;
	    /* Linked list Node*/
	    /* Utility functions */
	    /* Inserts a new Node at front of the list. */
	    public void addToTheLast(Node node)
	    {
	        if (head == null)
	        {
	            head = node;
	            lastNode = node;
	        }
	        else
	        {
	            Node temp = head;
	            lastNode.next = node;
	            lastNode = node;
	        }
	    }
	    /* Function to print linked list */
	    void printList()
	    {
	        Node temp = head;
	        while (temp != null)
	        {
	            System.out.print(temp.data+" ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    
	    

}
