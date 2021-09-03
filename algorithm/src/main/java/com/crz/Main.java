package com.crz;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        ListNode A=new ListNode();
        A=A.GetList();
        ListNode B=A.GetList2();
        A.printList(A.mergeTwoLists(A,B));
//        ListNode q=new ListNode(1);
//        ListNode p=new ListNode();
//        p=q;
//        p.val=5;
//        System.out.println(q.val);
    }





}
