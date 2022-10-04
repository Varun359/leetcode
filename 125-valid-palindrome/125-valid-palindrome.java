class Solution {
    public boolean isPalindrome(String s) {
        boolean flag = true;
        s= s.toLowerCase(); 
        
        int i = 0, j = s.length()-1;
        while(i<=j)
        {
         
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {  i++;
               continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j)))
            {  j--;
               continue;
            }
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}