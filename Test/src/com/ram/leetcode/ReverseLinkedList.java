package com.ram.leetcode;

class ListNode {
	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) {
		this.val = val;
	}
	
	ListNode (int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class ReverseLinkedList {
	
	public static ListNode reverseList(ListNode head) {
		
		if(head == null) {
			return null;
		}
		
		ListNode prev = null; //First value
		
		ListNode curr = head;
		while (curr != null) {
			
			ListNode next = curr.next;
			
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1); 
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the values
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        
        System.out.println("");
        System.out.println("----------");
		
        ListNode reverse = ReverseLinkedList.reverseList(head);
        
        System.out.println("Reversed Value");
     // Print the values
        ListNode current2 = reverse;
        while (current2 != null) {
            System.out.print(current2.val + " -> ");
            current2 = current2.next;
        }
        
        System.out.println("");
        System.out.println("----------");
        
        ListNode reverse2 = ReverseLinkedList.reverseList(new ListNode());
        
        ListNode current3 = reverse2;
        while (current3 != null) {
            System.out.print(current3.val + " -> ");
            current3 = current3.next;
        }
		
		
		
	}

}
