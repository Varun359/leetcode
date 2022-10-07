class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int char_arr[] = new int[26];
      
        for(int i = 0;i<magazine.length();i++)
        {
            char c = magazine.charAt(i);
            char_arr[c - 97]++;
        }
        
        for(int i = 0;i<ransomNote.length();i++)
        {
           char c = ransomNote.charAt(i);
           if(char_arr[c - 'a'] == 0)
               return false;
           else
            char_arr[c - 97]--;
        }
         return true;
    }
}