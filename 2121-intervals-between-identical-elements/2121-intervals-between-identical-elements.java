class Solution {
    public long[] getDistances(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        
        Map<Integer,Long> sumLeft = new HashMap<>();
        Map<Integer,Integer> cntLeft = new HashMap<>();

        for(int i = 0; i < n; i++){
            int x = nums[i];

            int cnt = cntLeft.getOrDefault(x,0);
            long sum = sumLeft.getOrDefault(x,0L);

            res[i] += (long) cnt * i - sum;

            cntLeft.put(x,cnt+1);
            sumLeft.put(x,sum+i);
        }

        Map<Integer,Long> sumRight = new HashMap<>();
        Map<Integer,Integer> cntRight = new HashMap<>();

        for(int i = n-1; i >= 0; i--){
            int x = nums[i];

            int cnt = cntRight.getOrDefault(x,0);
            long sum = sumRight.getOrDefault(x,0L);

            res[i] += sum - (long) cnt * i;

            cntRight.put(x,cnt+1);
            sumRight.put(x,sum+i);
        }

        return res;
    }
}