class Solution {
    public int firstUniqueFreq(int[] nums) {
        LinkedHashMap<Integer,Integer> freq = new LinkedHashMap<>();
        int res = -1;
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer> freqcnt = new HashMap<>();
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            freqcnt.put(entry.getValue(), freqcnt.getOrDefault(entry.getValue(),0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(freqcnt.get(entry.getValue()) == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}