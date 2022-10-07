class Solution {
    int dp[];
    public int decode(String s, int i, int len)
    {
        if(i<len && s.charAt(i) == '0')
            return 0;
        if(i>=len)
            return 1;
        if(dp[i] != -1)
            return dp[i];
        int ways = 0;
        if(s.charAt(i) != '0')
          ways = decode(s,i+1,len);
        if(i+1<len && ((s.charAt(i)=='1' && s.charAt(i+1)<='9') || (s.charAt(i)=='2' && s.charAt(i+1)<'7')))
          ways += decode(s,i+2,len);
        return dp[i] = ways;
    }
    public int numDecodings(String s) {
       dp = new int[102];
        for(int i =0;i<102;i++)
            dp[i] = -1;
       int len = s.length();
       return decode(s, 0 , len);
    }
}