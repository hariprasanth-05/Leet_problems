class Solution {
    public int minimumPrefixLength(int[] nums) {
        int i = nums.length-1;
        while(i > 0){
            if(nums[i] <= nums[i-1]){
                return i;
            }
            i--;
        }
        return 0;
    }
}