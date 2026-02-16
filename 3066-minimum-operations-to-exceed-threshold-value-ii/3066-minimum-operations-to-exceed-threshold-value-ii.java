class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer((long)num);
        }

        int cnt = 0;
        while(pq.size() >= 2 && pq.peek() < k){
            long min = pq.poll();
            long max = pq.poll();
            long op = (min * 2) + max;
            cnt += 1;
            pq.offer(op);
        }
        return cnt;
    }
}