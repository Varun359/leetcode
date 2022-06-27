class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
           return false;
       Map<Character,Integer> hm = new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
           hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)-1);
       }
       for(char c: hm.keySet())
       {
           if(hm.get(c)!=0)
               return false;
       }
       return true;
    }    
}