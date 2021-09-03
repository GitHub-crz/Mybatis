package com.crz;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode GetList(){
        ListNode F=new ListNode(17);
        ListNode E=new ListNode(15,F);
        ListNode D=new ListNode(11,E);
        ListNode C=new ListNode(10,D);
        ListNode B=new ListNode(5,C);
        ListNode A=new ListNode(1,B);
        return A;
    }
    ListNode GetList2(){
        ListNode F=new ListNode(18);
        ListNode E=new ListNode(14,F);
        ListNode D=new ListNode(12,E);
        ListNode C=new ListNode(9,D);
        ListNode B=new ListNode(6,C);
        ListNode A=new ListNode(3,B);
        return A;
    }
    void printList(ListNode L){
        while(L!=null){
            System.out.println(L.val);
            L=L.next;
        }
    }
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1==null&&l2==null)return null;
        ListNode l=new ListNode();
        ListNode L=new ListNode();
        L.next=l;
        while (l1!= null&&l2!=null){
                if(l1.val<l2.val) {
                    l.next=new ListNode();
                    l=l.next;
                    l.val= l1.val;
                    l1 = l1.next;
                }
                else {
                    l.next=new ListNode();
                    l=l.next;
                    l.val=l2.val;
                    l2=l2.next;
                }
        }
        while(l1!=null){
            l.next=new ListNode();
            l=l.next;
            l.val=l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            l.next=new ListNode();
            l=l.next;
            l.val=l2.val;
            l2=l2.next;
        }
        return L.next.next;
    }
}

