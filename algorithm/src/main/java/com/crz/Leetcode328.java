package com.crz;

public class Leetcode328 {
    public static void main(String[] args) {
        ListNode A=new ListNode(0);
        A=A.GetList();
        A=oddEvenList(A);
        while(A!=null){
            System.out.println(A.val);
            A=A.next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode L=head;
        //L=head;
        ListNode L2=head.next;
        L.next=head.next;
        ListNode p=head;
        ListNode q=head.next;
        while(p.next!=null&&q!=null&&q.next!=null) {
            p.next = q.next;
            p = p.next;
            q.next=p.next;
            q=q.next;
        }
        p.next=L2;
        return L;
    }
}
