class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> less = new ArrayList();
        ArrayList<Integer> more = new ArrayList();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < pivot)
                less.add(nums[i]);
            else if(nums[i] > pivot)
                more.add(nums[i]);
            else
                count++;
        }
        
        while(count-->0)
        {
            less.add(pivot);
        }
        int j=0;
       
        for(int i=0;i<nums.length;i++)
        {
            if(i<less.size())
                nums[i] = less.get(i);
            else
                nums[i] = more.get(j++);
        }
        return nums;
        
    }
}