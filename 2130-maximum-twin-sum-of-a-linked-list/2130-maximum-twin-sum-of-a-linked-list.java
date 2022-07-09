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
        List<Integer> l = new ArrayList();
        ListNode start = head;
        while(start!=null)
        {
            l.add(start.val);
            start = start.next;
        }
        
        int i=0,j=l.size()-1;
        
        int sum = Integer.MIN_VALUE;
        while(i<j)
        {
            int s = l.get(i)+l.get(j);
            if(s>sum)
                sum=s;
            i++;
            j--;
        }
        return sum;
            
    }
}