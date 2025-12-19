class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int remaining = numBottles % numExchange;
            tot += newBottles; 
            numBottles = newBottles + remaining;
        }
        return tot;
    }
}