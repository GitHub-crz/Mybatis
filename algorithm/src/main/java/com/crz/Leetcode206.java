package com.crz;
public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode h=head;
        ListNode p=h;
        ListNode l=null;
        ListNode r=h.next;
        while(r!=null){
            p.next=l;
            p=r;
            r=r.next;
        }
        return p;
    }
}
