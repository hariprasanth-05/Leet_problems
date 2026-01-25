class Solution {
    public int minimumPrefixLength(int[] nums) {
        int i = 0;
        int ans = 0;
        while(i < nums.length-1){
            if(nums[i] >= nums[i+1]){
                ans = i+1;
            }
            i++;
        }
        return ans;
    }
}