class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;
        int i=0;
        int j=0;
        while(i<n){
            j = i;
            while(j+1 < n && nums[j] == nums[j+1]){
                j++;
            }
            int greatestcnt = n-j-1;
            if(greatestcnt >= k){
                res += j-i+1;
            }
            i = j+1;
        }
        return res;
    }
}