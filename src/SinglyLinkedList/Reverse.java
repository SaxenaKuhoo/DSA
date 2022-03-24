 class Reverse
 {
 public ListNode reverseList(ListNode head) 
 {
        ListNode prev=null,next=null,curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}
