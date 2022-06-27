import java.util.Map.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len=strs.length;
        List<List<String>> l =new ArrayList();
        if(len==0)
            return l;
        Map<String,List<String>> hm = new HashMap();
       for(String s: strs)
       {
           char ch[] = new char[26];
           for(int i=0;i<s.length();i++)
           {
              ch[s.charAt(i)-'a']++;
           }
           String str = String.valueOf(ch);
           if(hm.get(str) == null)
           {
               hm.put(str, new ArrayList());
           }
           hm.get(str).add(s);
           
       }
    
       for(Entry<String,List<String>> e : hm.entrySet())
       {
           l.add(e.getValue());
       }
        return l;
    }
}