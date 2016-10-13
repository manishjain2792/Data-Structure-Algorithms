package linkedList;

public class RecursiveReserveLinkedList {

	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void recursiveReverse(Node node){
		Node first;
		Node rest;
		
		//check for empty list		
		if(node==null){
			return; 
		}
		
		first=node;
		rest=first.next;
		// list has only one node
		if(rest==null){
			return;
		}
		
		// reverse the rest list and put the first element
		recursiveReverse(rest);
		first.next.next=first;
		
		first.next=null;
		node=rest;
		System.out.println(node.data);
		
	}
	
	void printList(Node node){
		while(node!=null){
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursiveReserveLinkedList list = new RecursiveReserveLinkedList();
		RecursiveReserveLinkedList.head = new Node(10);
		RecursiveReserveLinkedList.head.next = new Node(15);
		RecursiveReserveLinkedList.head.next.next = new Node(20);
		RecursiveReserveLinkedList.head.next.next.next = new Node(25);
         
        System.out.println("Original Linked list is :");
       // list.printList(head);
        list.recursiveReverse(head);
        System.out.println("");
        System.out.println("Reversed linked list : ");
     //   list.printList(head);

	}

}
