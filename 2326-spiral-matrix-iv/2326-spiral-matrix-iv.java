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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
       
        int ch=1;
        if(m==0 && n==0)
            return new int[0][0];
        int arr[][]=new int[m][n];
        int row_begin = 0;
        int row_end = m-1;
        int col_begin = 0;
        int col_end = n-1;
        int i;
        
        while(row_begin <= row_end && col_begin <= col_end)
        {
            for(i=col_begin;i<=col_end;i++)
            {
                if(head==null)
                  ch = -1;
                if(ch!=-1){
                  arr[row_begin][i] = head.val;
                  head = head.next;
                }
                else
                  arr[row_begin][i] = -1;
            }
            row_begin++;
            
            for(i=row_begin;i<=row_end;i++)
            {
                if(head==null)
                  ch = -1;
                if(ch!=-1){
                  arr[i][col_end] = head.val;
                  head = head.next;
                }
                else
                  arr[i][col_end] = -1;
            }
            col_end--;
            
            if(row_begin <= row_end )
             for(i=col_end;i>=col_begin;i--)
            {
                if(head==null)
                  ch = -1;
                if(ch!=-1){
                  arr[row_end][i] = head.val;
                  head = head.next;
                }
                else
                  arr[row_end][i] = -1;
            }
            row_end--;
            
            if(col_begin <= col_end)
            for(i=row_end;i>=row_begin;i--)
            {
                if(head==null)
                  ch = -1;
                if(ch!=-1){
                  arr[i][col_begin] = head.val;
                  head = head.next;
                }
                else
                  arr[i][col_begin] = -1;
            }
            col_begin++;
            
        }
        return arr;
        
    }
}