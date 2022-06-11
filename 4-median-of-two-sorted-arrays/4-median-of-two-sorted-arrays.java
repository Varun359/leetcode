class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int nums3[]= new int[nums1.length + nums2.length];
       int i=0;
       while(i<nums1.length)
       {
           nums3[i]=nums1[i++];
       }
       int j=0;
       while(j<nums2.length)
       {
           nums3[i++]=nums2[j++];
       }
       double median;
       Arrays.sort(nums3);
       for(j=0;j<nums3.length;j++)
          System.out.println(nums3[j]);
       if(nums3.length % 2 == 0)
       {
           int c = nums3.length/2;
           median = (double) (nums3[c-1]+nums3[c])/2;
       }
       else
       {
           int c = nums3.length/2;
           median = nums3[c];
       }
       return median;
    }
}