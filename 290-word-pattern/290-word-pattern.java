class Solution {
    public boolean wordPattern(String pattern, String s) {
     
        String strs[] = s.split(" ");
        System.out.println(pattern.length());
        System.out.println(strs.length);
        if(pattern.length()!=strs.length)
            return false;
        
        Map<Character, String> pmap= new HashMap();
        Map<String, Character> smap= new HashMap();
        for(int i=0;i<pattern.length();i++)
        {
            char str1=pattern.charAt(i);
            if(pmap.containsKey(str1))
            {
                if(!pmap.get(str1).equals(strs[i]))
                    return false;
            }
            else
            {
                pmap.put(str1,strs[i]);
            }
            
            String str2=strs[i];
            if(smap.containsKey(str2))
            {
                if(!smap.get(str2).equals(pattern.charAt(i)))
                    return false;
            }
            else
            {
                smap.put(str2,pattern.charAt(i));
            }
        }
        
        return true;
        
    }
}