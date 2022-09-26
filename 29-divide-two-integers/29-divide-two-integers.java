class Solution {
    public int divide(int dividend, int divisor) {
      if(divisor == 0)
          return Integer.MAX_VALUE;
        
      if(dividend == Integer.MIN_VALUE && divisor == -1)
          return Integer.MAX_VALUE;
        
      long pDividend = Math.abs((long)dividend);
      long pDivisor = Math.abs((long)divisor);
      int result = 0;
      while(pDividend >= pDivisor)
      {
          int shifts = 0;
          while(pDividend >= (pDivisor << shifts))
              shifts++;
          shifts--;
          result += 1 << shifts;
          pDividend -= pDivisor<<shifts;
      }
        
      if(dividend<0 && divisor>0) 
            return -result;
       if(dividend>0 && divisor<0) 
            return -result;
      return result;
    }
}