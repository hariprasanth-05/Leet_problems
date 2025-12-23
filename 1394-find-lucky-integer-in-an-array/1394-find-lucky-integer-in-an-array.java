class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        int luckyInt = 0;
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                luckyInt = Math.max(luckyInt,entry.getValue());
            }
        }

        if(luckyInt != 0) return luckyInt;
        else return -1;
    }
}