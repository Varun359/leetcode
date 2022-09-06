class Solution {
    public int longestSubstring(String s, int k) {
        int result = 0;
        int arr[] = new int[26];
        
        for(int i = 0;i<s.length(); i++)
        {
            char c = s.charAt(i);
            int idx = c - 97;
            arr[idx] = arr[idx]+1;
        }
        
        boolean flag = true;
        for(int i = 0;i<26;i++)
            if(arr[i] < k && arr[i] > 0)
                flag = false;
        if(flag == true)
            return s.length();
        
        int start = 0;
        int end = 0;
        while(end<s.length() && (arr[s.charAt(end) - 'a'] >= k))
         end++;
        result = Math.max(result, longestSubstring(s.substring(start,end),k));
          
        while(end<s.length() && (arr[s.charAt(end) - 'a'] < k))
         end++;
        result = Math.max(result, longestSubstring(s.substring(end),k));
      
        return result ;
    }
}