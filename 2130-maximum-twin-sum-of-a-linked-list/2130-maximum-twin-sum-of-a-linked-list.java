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
    public int pairSum(ListNode head) {
    
        if(head == null)
            return 0;
        ListNode start = head;
        int len = 0;
        while(start!=null)
        {
            len++;
            start = start.next;
        }
       
        int i=0;
        start = head;
        ListNode next_node=null, prev_node = null, curr_node = head;
        while(i<len/2)
        {
            next_node = curr_node.next;
            curr_node.next= prev_node;
            prev_node = curr_node;
            curr_node = next_node;
            i++;
        }
        start.next = curr_node;
        head = prev_node;
        start = head;
        
        i=0;
        
        while(i<len/2)
        {
            start = start.next;
            i++;
        }
        
        int sum = Integer.MIN_VALUE;
        //System.out.println(start.val);
        i=0;
        while(i<len/2)
        {
            int s = head.val + start.val;
             //System.out.println(s);
            if(s>sum)
                sum = s;
            
            head=head.next;
            start = start.next;
            i++;
        }
        return sum;
    }
}