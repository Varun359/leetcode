class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
        if(nums == null || nums.length == 0 )
            return new ArrayList();
        
        List<List<Integer>> answer = new ArrayList();
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0)
                break;
            int sum = nums[i];
            int left = i+1;
           // List<Integer> l = new ArrayList();
            //l.add(sum);
            int right = nums.length-1;
            // for(int j=i+1;j<nums.length;j++)
            // {
                while(left<right)
                {
                   
                    //System.out.println("left "+left + "right "+right);
                    int temp = nums[left]+nums[right];
                    //int temp =  9;
                    int s = sum + temp;
                    //System.out.println(sum+" "+temp);
                    if(s < 0)
                      left++;
                    else if(s > 0)
                      right--;
                    else
                    {
                      // l.add(nums[left++]);
                        //l.add(nums[right--]);
                       
                        answer.add(Arrays.asList(sum,nums[left++], nums[right--]));
                        while(left<right && nums[left] == nums[left-1])
                            left++;
                        while(left<right && nums[right] == nums[right+1])
                            right--;
                        //l.remove(l.size()-1);
                        //l.remove(l.size()-1);
                    }
               }              
        }
        return answer;
    }
}