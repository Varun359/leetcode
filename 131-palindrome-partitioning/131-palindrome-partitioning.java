class Solution {
    public static boolean isPalindrome(String s)
    {
        int i;
        for(i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    public static void findPalindrome(String s, int i,int length, List<List<String>> result,List<String> l)
    {
        if(i==length)
        {   
             result.add(new ArrayList<>(l));
             return;
        }
        for(int index=i;index<length;index++)
        {
          if(isPalindrome(s.substring(i, index+1)))
         {
            l.add(s.substring(i, index+1));
            findPalindrome(s, index+1, length, result, l);
            l.remove(l.size()-1);
        }
       }
    }
    public List<List<String>> partition(String s) {
        
        List<List<String>> result = new ArrayList();
        
        findPalindrome(s, 0, s.length(), result, new ArrayList<String>());
        
        return result;
    }
}