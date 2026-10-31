class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int pile : piles){
            r = Math.max(r,pile);
        } 
        int res = r;
        while(l<=r){
            int k = l+(r-l)/2;
            long th = 0;
        for(int pile : piles){
            th += ((long)pile + k -1)/k;
        }
        if(th<=h){
            res = k;
            r = k-1;
        }
        else{
            l= k+1;
        }
        }
        return res;
    }
}
