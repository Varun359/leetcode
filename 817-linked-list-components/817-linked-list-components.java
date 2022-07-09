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
    public int numComponents(ListNode head, int[] nums) {
        
        int count =0;
        if(head == null || nums.length==0|| nums==null)
            return 0;
        
        Set<Integer> s = new HashSet();
        for(int ele : nums)
           s.add(ele);
        int sub_count = 0;
        while(head!=null)
        {
            int e = head.val;
            if(s.contains(e) && sub_count==0)
                sub_count = 1;
            else if(s.contains(e) && sub_count==1)
            {  head = head.next;
                continue;
            }
            else
            {
                count+= sub_count;
                sub_count = 0;
            }
            head = head.next;
        }
        if(sub_count!=0)
            count+=sub_count;
        return count;
    }
}