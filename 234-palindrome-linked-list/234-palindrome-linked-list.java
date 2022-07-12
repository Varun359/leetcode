/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        String s="";
        if(head==null || head.next == null)
            return true;
        StringBuffer sb=new StringBuffer(s);
        while(head!=null)
        {
            sb.append(head.val);
            head=head.next;
        }
        String one=sb.toString();
        sb.reverse(); 
        String two=sb.toString();
        System.out.println(one);
        System.out.println(two);
        if(one.compareTo(two)==0)
            return true;
        else
            return false;
        
    }
}