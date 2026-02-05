class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            int op = (i+nums[i])%n;
            if(op < 0){
                res[i] = nums[n+op];
            }
            else res[i] = nums[op];
        }
        return res;
    }
}