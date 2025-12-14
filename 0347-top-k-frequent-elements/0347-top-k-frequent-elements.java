class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            freqMap.put(nums[i] , freqMap.getOrDefault(nums[i],0)+1);
        }

        for(int key : freqMap.keySet()){
            int freq = freqMap.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int cnt = 0;

        for(int i=bucket.length -1; i>=0 && cnt < k; i--){
            if(bucket[i] != null){
                for(Integer j : bucket[i]){
                    res[cnt++] = j;
                }
            }
        }
        return res;
    }
}