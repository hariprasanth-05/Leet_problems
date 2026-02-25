class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        TreeMap<Integer,List<Integer>> mpp = new TreeMap<>();
        for(int i = 0; i < arr.length; i++){
            int bitcnt = Integer.bitCount(arr[i]);
            if(!mpp.containsKey(bitcnt)){
                mpp.put(bitcnt,new ArrayList<>());
            }
            mpp.get(bitcnt).add(arr[i]);
            // collections.sort(mpp.get(bitcnt));
        }
        int[] res = new int[arr.length];
        int ind = 0;
        for(Map.Entry<Integer,List<Integer>> entry : mpp.entrySet()){
            List<Integer> list = entry.getValue();
            for(int i = 0; i < list.size(); i++){
                res[ind++] = list.get(i);
            }
        }
        return res;
    }
}