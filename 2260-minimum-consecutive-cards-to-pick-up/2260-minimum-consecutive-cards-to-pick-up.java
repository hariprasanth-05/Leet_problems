class Solution {
    public int minimumCardPickup(int[] cards) {
        int min = Integer.MAX_VALUE;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < cards.length; i++){
            if(mpp.containsKey(cards[i])){
                int ind = mpp.get(cards[i]);
                min = Math.min(min,i-ind+1);
            }
            mpp.put(cards[i],i);
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}