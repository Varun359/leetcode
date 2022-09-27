class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return 0;
        Set<Character> hs = new HashSet();
        int count = 0;
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(hs.contains(c))
            {
                hs.remove(c);
                count++;
            }
            else
               hs.add(c);
        }
        
        if(!hs.isEmpty())
             return count * 2 +1;
        return count*2;
    }
}