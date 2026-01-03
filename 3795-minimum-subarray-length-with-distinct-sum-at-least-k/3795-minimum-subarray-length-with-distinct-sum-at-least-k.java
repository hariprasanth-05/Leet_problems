class Solution {
    public int minLength(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(j < nums.length){
            mpp.put(nums[j] ,mpp.getOrDefault(nums[j],0)+1);
            if(mpp.get(nums[j]) == 1){
                sum += nums[j];
            }
            while(sum >= k){
                min = Math.min(min, j-i+1);
                mpp.put(nums[i],mpp.get(nums[i])-1);
                if(mpp.get(nums[i]) == 0){
                    sum -= nums[i];
                }
                i++;
            }
            j++;
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min; 
    }
}
