class Solution {
    public void sortColors(int[] nums) {
       int i=0,j=nums.length-1,ite=0;
       while(ite<=j)
       {
           if(nums[ite]==0)
           {
              swap(nums,i,ite);
              ite++;
              i++;
           }
           else if(nums[ite]==2)
           { 
             swap(nums,ite,j);
             j--;
           }
           else{
               ite++;
           }
                
       }
    }
    public void swap(int nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        
    }
}