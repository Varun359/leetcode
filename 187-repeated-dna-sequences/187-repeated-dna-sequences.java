class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        int start = 0;
        if(s.length() < 10)
            return new ArrayList();
        String temp = s.substring(0,10);
        List<String> result = new ArrayList();
        Set<String> set = new HashSet();
        set.add(temp);

        for(int i = 11;i<=s.length();i++)
        {
          start++;
          temp = s.substring(start,i);
          
          if(set.contains(temp) && !result.contains(temp))
              result.add(temp);
          else
              set.add(temp);
        }
        
        return result;
    }
}