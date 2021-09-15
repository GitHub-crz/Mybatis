package com.crz;

public class Leetcode234 {
    public static void main(String[] args) {
        String[] s=new String[10];
        System.out.println(s[9]);
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=new ListNode(0);
        slow=head;
        ListNode fast=new ListNode(0);
        fast=head;
        while(fast.next==null){
            slow=slow.next;
            fast=fast.next;
            if(fast==null)break;
            fast=fast.next;
        }
        return false
                ;

    }
}
