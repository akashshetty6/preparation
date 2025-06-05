package linkedlist;

public class SinglyLL {
	private Node head;
	private Node tail;
	
	private int size;
	public SinglyLL() {
		this.size=0;
	}
	
	public static void main(String[] args) {
		SinglyLL ll=new SinglyLL();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
//		ll.insertFirst(40);
		ll.insertLast(40);
//		ll.insertLastTail(50);
		ll.insert(99, 3);
		ll.display();
		ll.deleteFirst();
		ll.display();
		ll.deleteLast();
//		ll.deleteLast();
		ll.display();
//		ll.deleteLastFromNode();
		ll.deleteIndex(1);
		
		ll.display();
	}
	

	public void display() {
		Node tmp=head;
		while(tmp!=null) {
			System.out.print(tmp.val + "-->");
			tmp=tmp.ref;
		}
		System.out.println("END");
		System.out.println(tail.val);
	}
	
	public void insertFirst(int val) {
        Node node = new Node(val);
        node.ref = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.ref = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.ref;
        }

        Node node = new Node(val,temp.ref);
//        node.ref=temp.ref;
        temp.ref = node;
        

        size++;
    }
    
    public void insertUsingRecursion(int val, int index) {
    	head=insertRec(val, index, head);
    }
    
    private Node insertRec(int val, int index,Node node) {
    	if(index==0) {
    		Node temp=new Node(val,node);
    		size++;
    		return temp;
    	}
    	node.ref= insertRec(val, index--, node.ref);
    	return node;
    }
    
    public void deleteFirst() {
    	head=head.ref;
    	if(head==null) {
    		tail=null;
    	}
    	size--;
    }
    
    public void deleteLast() {		
    	Node temp=head;
    	while(temp.ref.ref!=null){
    		temp=temp.ref;
    	}
    	tail=temp;
    	temp.ref=null;
    	size--;
    }
    
//    second approach
    
    public void deleteLastFromNode() {
    	Node secondLast = getNode(size-2);
    	System.out.println("last node value "+ tail.val);
    	tail=secondLast;
    	tail.ref=null;
    	size--;
    }
    
    public void deleteIndex(int index) {
    	Node node = getNode(index-1);
    	node.ref=node.ref.ref;
    	size--;
    }
    
    public Node getNode(int size) {
    	Node node=head;
    	for (int i = 0; i < size; i++) {
			node=node.ref;
		}
    	return node;
    }
    
	public void reverse(Node node) {
		if(node == tail) {
			head=tail;
			return;
		}
		reverse(node);
		tail.ref=node;
		node=tail;
		tail.ref=null;
	}
	
	public void insertLastTail(int val) {
		Node newNode=new Node(val);
		if(tail==null) {
			insertFirst(val);
		}
		tail.ref=newNode;
		tail=newNode;
		size++;
	}
	
	class Node{
		private int val;
		private Node ref;
		
		public Node(int val){
			this.val=val;
		}
		public Node(int val,Node ref) {
			this.val=val;
			this.ref=ref;
		}
	}
}
