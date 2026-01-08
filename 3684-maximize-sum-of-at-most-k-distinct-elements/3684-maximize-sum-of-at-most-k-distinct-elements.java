class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int prev = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(prev != nums[i] && k != 0){
                prev = nums[i];
                list.add(prev);
                k--;
            }
        }
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}