class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int i = 0;
        int j = 1;
        int sum = nums[i];
        int ans = 0;
        ans = Math.max(ans,sum);
        while(j<nums.length){
            if(nums[j-1] < nums[j]){
                sum += nums[j];
                ans = Math.max(sum,ans);
                System.out.print(sum + " ");
                j++;
            }
            else{
                
                if(j<nums.length) {
                    j++;
                    i=j-1;
                }
                sum = nums[i];
            }
        }
        
        return ans;
    }
}