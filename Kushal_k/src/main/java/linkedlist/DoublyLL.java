package linkedlist;

import linkedlist.SinglyLL.Node;

public class DoublyLL {

	private Node head;
	public static void main(String[] args) {
		DoublyLL dll=new DoublyLL();
		dll.insertFirst(10);
		dll.insertFirst(20);
		dll.insertFirst(30);
		dll.insertFirst(40);
		dll.display();
		dll.insertLast(50);
		dll.display();
		dll.insertAfter(30, 34);
		dll.display();
		
	}
	
	public void display() {
		Node temp=head;
		Node last=null;
		while(temp!=null) {
			System.out.print(temp.val +"->");
			last=temp;
			temp=temp.next;
		}
		System.out.println("END");
		
//		while(last!=null) {
//			System.out.print(last.val+ "->");
//			last=last.prev;
//		}
//		System.out.println("END");
		
	}
	
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;
	}
	
	public void insertLast(int val) {
		Node node =new Node(val);
		Node temp=head;
		
		if(head==null) {
			node.prev=null;
			head=node;
			node.next=null;
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		node.prev=temp;
		node.next=null;
		
	}
	
	public void insertAfter(int afterVal,int val) {
		Node p=getNode(afterVal);
		Node node=new Node(val);
		node.prev=p;
		node.next=p.next;
		p.next=node;
		if(node.next!=null) {
			node.next.prev=node;
		}
		
	}
	
	public Node getNode(int aval) {
		Node temp=head;
		while(temp!=null) {
			if(temp.val==aval) {
				return temp;
			}
			temp=temp.next;
		}
		return null;
	}

	private class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
		}
		
	}
}

