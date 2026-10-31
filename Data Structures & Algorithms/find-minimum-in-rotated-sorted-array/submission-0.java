class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];
        for(int i : nums){
            res = Math.min(res,i);

        }
        return res;
    }
}
