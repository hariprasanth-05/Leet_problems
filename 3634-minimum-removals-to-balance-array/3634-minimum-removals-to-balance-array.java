class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int min1 = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        while(r < n){
            if(nums[r] <=((long) nums[l]*k)){
                min1 = Math.min(min1,n - (r - l +1));
            }
            else{
                l++;
            }
            r++;
        }
        return min1;
    }
}