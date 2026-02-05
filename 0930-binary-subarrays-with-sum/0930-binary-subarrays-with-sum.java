class Solution {
    public int findSubarray(int[] nums,int goal){
        if(goal < 0) return 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt = 0;
        while(r < nums.length){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            if(sum <= goal){
                cnt += r-l+1;
            }
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return findSubarray(nums,goal) - findSubarray(nums,goal-1);
    }
}