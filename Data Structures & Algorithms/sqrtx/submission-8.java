class Solution {
    public int mySqrt(int x) {

        // int l = 0, r = x, res = 0;

        // while(l <= r) {
        //     int mid = l + (r - l) / 2;
        //     long val = mid * mid;
        //     if(val == x) return mid;
        //     if(val > x) r = mid - 1;
        //     else {
        //         l = mid + 1;
        //         res = mid;
        //     }
        // }

        // return res;

        int l = 0, r = x;
        int res = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((long) m * m > x) {
                r = m - 1;
            } else if ((long) m * m < x) {
                l = m + 1;
                res = m;
            } else {
                return m;
            }
        }

        return res;
        
    }
}