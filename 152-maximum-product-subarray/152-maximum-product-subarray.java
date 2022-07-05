class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            int max = nums[i];
            if(max> maxProd)
                maxProd = max;
         for(int j=i+1;j<nums.length;j++)
         {
             max *= nums[j];
             if(max> maxProd)
                maxProd = max;
         }
        }
        int arrMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
         if(arrMax < nums[i])
            arrMax = nums[i];
        }
        System.out.println(arrMax);
        if(arrMax>maxProd)
            maxProd = arrMax;
        return maxProd;
    }
}