class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum = 0,i = 0;
        int subArray = 0;
        int result = 0;
        int j = 0;
        while(i<arr.length)
        {
            sum += arr[i];
            subArray++;
            if(subArray == k)
            { double avg = (double) sum/k;
              if(avg >= threshold)
                result++;
              subArray--;
              sum -= arr[j++];
            }
            i++;
        
        }
        return result;
    }
}