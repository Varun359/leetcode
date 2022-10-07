/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        // boolean prev_ver = false;
        // int prev_mid = -1;
        // int ch = 0;
        while(high - low > 1)
        {
            int mid = low+(high - low)/2;
//             boolean curr_ver = isBadVersion(mid);
//             if(curr_ver == false)
//             {
//                 low = mid+1;
//             }
//             else
//                 high = mid - 1;
//             if(ch == 1 && prev_ver == false && curr_ver == true)
//                 return mid;
//             if(ch == 1 && prev_ver == true && curr_ver == false)
//                 return prev_mid;
            
//             prev_mid = mid;
//             prev_ver = curr_ver;
//             ch = 1;
            if(isBadVersion(mid))
                high = mid;
            else
                low = mid;
                
        }
        return high;
    }
}