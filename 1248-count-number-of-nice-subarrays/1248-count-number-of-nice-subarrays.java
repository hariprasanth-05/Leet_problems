class Solution {
    public int findSubarr(int[] nums,int k){
        if(k < 0) return 0;
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt = 0;
        while(r < n){
            sum += nums[r] % 2;
            while(sum > k){
                sum -= nums[l] % 2;
                l++;
            }
            if(sum <= k){
                cnt += r - l + 1;
            }
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = nums[i] % 2;
        // }
        
        int n1 = findSubarr(nums,k);
        int n2 = findSubarr(nums,k-1);
        
        return n1 - n2;
    }
}