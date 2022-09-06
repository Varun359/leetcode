class Solution {
    public int longestSubstring(String s, int k) {
        int result = 0;
        // int chars[] = s.toCharArray();
        int count[] = new int[26];
        
        for(int h = 0;h<=26;h++)
        {
            Arrays.fill(count, 0);
            int unique = 0;
            int equalToK = 0;
            int i = 0;
            int j = 0;
            while(j<s.length())
            {
                if(unique<=h)
                {
                    int c = s.charAt(j) - 97;
                    if(count[c] == 0)
                        unique++;
                    count[c]++;
                    if(count[c] == k)
                        equalToK++;
                    j++;
                }
                else
                {
                    int c = s.charAt(i) - 97;
                    if(count[c] == k)
                        equalToK--;
                    count[c]--;
                    if(count[c] == 0)
                        unique--;
                    i++;
                }
                if(unique == h && unique == equalToK)
                  result = Math.max(j-i, result);
            }    
        }
        return result ;
    }
}