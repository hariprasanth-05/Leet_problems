class Solution {
    public int maxAscendingSum(int[] nums) {
        int curSum = nums[0];
        int maxSum = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < nums[i]){
                curSum += nums[i];
            }
            else{
                maxSum = Math.max(curSum,maxSum);
                curSum = nums[i];
            }
        }
        maxSum = Math.max(curSum,maxSum);
        return maxSum;
    }
}