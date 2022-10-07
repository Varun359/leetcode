class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int char1[] = new int[26];
        int char2[] = new int[26];
        
        for(int i = 0;i<ransomNote.length();i++)
        {
            char c = ransomNote.charAt(i);
            char1[c - 97]++;
        }
        
        for(int i = 0;i<magazine.length();i++)
        {
            char c = magazine.charAt(i);
            char2[c - 97]++;
        }
        
        for(int i = 0;i<26;i++)
        {
            if(char1[i] > char2[i])
                return false;
        }
         return true;
    }
}