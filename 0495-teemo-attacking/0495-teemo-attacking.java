class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int tot = duration;
        for(int i = 1; i < n; i++){
            if(timeSeries[i] < timeSeries[i-1]+duration){
                tot += timeSeries[i] - timeSeries[i-1];
            }
            else tot += duration;
        }
        return tot;
    }
}