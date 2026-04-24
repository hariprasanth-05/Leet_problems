class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        Map<Character,Integer> mpp = new HashMap<>();
        for(char ch : moves.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        if(mpp.size() < 3){
            if(mpp.containsKey('_')) return moves.length();
        }
        int r = mpp.getOrDefault('R',0);
        int l = mpp.getOrDefault('L',0);
        int u = mpp.getOrDefault('_',0); 
        if(r > l){
            return Math.abs((r + u)-l);
        }
        return Math.abs((l + u)-r); 
    }
}