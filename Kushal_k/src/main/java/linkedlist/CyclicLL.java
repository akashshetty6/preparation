package linkedlist;

public class CyclicLL {
	
//	https://leetcode.com/problems/linked-list-cycle/ 141
	public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast != null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
	
	public int cycleLength(ListNode head) {
		ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
            	ListNode temp=slow;
            	int count=0;
            	do {
            		temp=temp.next;
            		count++;
            	}while (temp!=slow);
            	return count;
            	
            }
        }
        return 0;
	}
//	142
	public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast != null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                length=cycleLength(slow);
                break;
            }
        }

        if(length==0){
            return null;
        }

        ListNode f=head;
        ListNode s=head;
        while (length>0){
            s=s.next;
            length--;
        }

        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return f;
    }

//	202 https://leetcode.com/problems/happy-number/
	public boolean isHappy(int n) {
        int f=n;
        int s=n;

        do{
            s=findSquare(s);
            f=findSquare(findSquare(f));
        }while(f!=s);

        if(s==1){
            return true;
        }
        return false;
        
    }

    int findSquare(int n){
        int ans=0;
        while(n > 0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
//  876
    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;

        while(f !=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
   
//    21  https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead=new ListNode();
        ListNode tail=dummyHead;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }

        tail.next=(list1!=null) ? list1:list2;
        return dummyHead.next;

    }
}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) {
	 val = x;
	 next = null;
	 }
}

