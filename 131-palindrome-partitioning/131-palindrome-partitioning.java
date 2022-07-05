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
    public static void findPalindrome(String s, int i,int j,int length, List<List<String>> result,List<String> l, int len)
    {
        if(j==length)
        {   //if(i<s.length() && isPalindrome(s.substring(i,j-1)))\
            System.out.println(l+" "+len);
            if(len==length)
             result.add(new ArrayList<>(l));
            return;
        }
        if(isPalindrome(s.substring(i, j+1)))
        {
            l.add(s.substring(i, j+1));
            int index=j;
            findPalindrome(s, index+1,j+1, length, result, l, len+(j-i)+1);
            l.remove(l.size()-1);
        }
            findPalindrome(s, i , j+1, length, result, l, len);
    }
    public List<List<String>> partition(String s) {
        
        List<List<String>> result = new ArrayList();
        
        findPalindrome(s, 0,0, s.length(), result, new ArrayList<String>(), 0);
        
        return result;
    }
}