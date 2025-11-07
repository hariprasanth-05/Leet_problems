class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            st.add(nums[i]);
        }
        int i = 1;
        int missnum = 0;
        while (true){
            missnum = k*i;
            if(!st.contains(missnum)) {
                break;
            };
            i++;
        }
        return missnum;
    }
}