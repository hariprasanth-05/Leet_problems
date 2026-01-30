class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> freq = new HashMap<>();
        int maxLen = 0;
        int l = 0;
        int r = 0;
        while(r < fruits.length){
            freq.put(fruits[r], freq.getOrDefault(fruits[r],0)+1);

            if(freq.size() > 2){
                freq.put(fruits[l], freq.get(fruits[l])-1);
                if(freq.get(fruits[l]) == 0){
                    freq.remove(fruits[l]);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}