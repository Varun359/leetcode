class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
           return false;
        char c1[] = new char[26];
        char c2[] = new char[26];
         
        for(char c : s.toCharArray())
        {
            c1[c-'a']++;
        }
         for(char c : t.toCharArray())
        {
            c2[c-'a']++;
        }
        int i;
        for(i=0;i<26;i++)
        {  if(c1[i]!=c2[i])
            break;
        }
        if(i==26)
            return true;
        return false;
    }    
}