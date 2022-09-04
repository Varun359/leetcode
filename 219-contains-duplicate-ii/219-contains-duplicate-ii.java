class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> set = new HashSet<>();
    int number = 0;
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
        if (!set.add(nums[i])) {
            number = nums[i];
            index = i;
            
        }
        for (int j = 0; j < index; j++) {
            if (nums[j] == number && Math.abs(i - j) <= k) {
                    return true;
            }
        }
    }
    return false;
        
    }
}