class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        double avg = 0;
        for(int i=0; i < n; i++){
            st.add(nums[i]);
            avg += nums[i];
        }
        avg = avg / n;
        int candidate = Math.max(1, (int)Math.floor(avg) + 1);
        System.out.print(candidate);
        while(true){
            if(!st.contains(candidate)){
                return candidate;
            }
            candidate++;
        }
    }
}