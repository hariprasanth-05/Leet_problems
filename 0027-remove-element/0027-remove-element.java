class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int cnt = 0;
        while(i <= j){
            if(nums[i] == val){
                if(nums[j] != val){
                    cnt++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
                else {
                    if(nums[j] == val) cnt++;
                    j--;
                }
            }
            else i++;
        }
        return nums.length - cnt;
    }
}