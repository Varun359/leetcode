class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        Map<Character, Character> smap= new HashMap();
        Map<Character, Character> tmap= new HashMap();
        for(int i=0;i<s.length();i++)
        {
            char str1=s.charAt(i);
            if(smap.containsKey(str1))
            {
                if(smap.get(str1)!=t.charAt(i))
                    return false;
            }
            else
            {
                smap.put(str1,t.charAt(i));
            }
            
            char str2=t.charAt(i);
            if(tmap.containsKey(str2))
            {
                if(tmap.get(str2)!=s.charAt(i))
                    return false;
            }
            else
            {
                tmap.put(str2,s.charAt(i));
            }
        }
        return true;
    }
}