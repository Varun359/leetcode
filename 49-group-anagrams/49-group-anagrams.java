import java.util.Map.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len=strs.length;
        
        if(len==0)
            return new ArrayList();;
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
    
       // for(Entry<String,List<String>> e : hm.entrySet())
       // {
       //     l.add(e.getValue());
       // }
       List<List<String>> l =new ArrayList<>(hm.values());
        return l;
    }
}