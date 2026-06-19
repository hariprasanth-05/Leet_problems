class Solution {
    public int largestAltitude(int[] gain) {
        // int[] alti = new int[gain.length+1];
        int prev = 0;
        int maxAlti = 0;
        for(int i = 0; i < gain.length; i++){
            prev += gain[i];
            maxAlti = Math.max(prev,maxAlti);
        }
        return maxAlti;
    }
}