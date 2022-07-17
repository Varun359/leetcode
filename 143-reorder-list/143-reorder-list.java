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
    public ListNode reverse(ListNode mid)
    {
        ListNode prev = null;
        while(mid != null)
        {
            ListNode temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null)
            return;
        int n=0;
        ListNode start = head;
        while(start != null)
        {
            n++;
            start = start.next;
        }
        
        ListNode mid = head, prev = null;
        int i=0;
        while(i<n/2)
        {
            prev = mid;
            mid = mid.next;
            i++;
        }
        
        prev.next = null;
        
        //System.out.println(mid.val);
        
        mid = reverse(mid);
        
        ListNode trav = head.next, link = head;
        int ch = 1; 
        
         while(trav!=null && mid!=null)
         {
           if(ch == 0)
           {
               link.next = trav;
               trav = trav.next;
               link = link.next;
               ch = 1;
           }
           else
           {
               link.next = mid;
               mid = mid.next;
               link=link.next;
               ch=0;
           }
         }
        
         while(mid!=null)
         {
             link.next = mid;
             link = link.next;
             mid = mid.next;
         }

    }
}