class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int prev = 1;
        int[] laser = new int[n];
        for(int i = 0; i < n; i++){
            int one = 0;
            for(int j = 0; j < bank[i].length(); j++){
                if(bank[i].charAt(j) == '1') one++;
            }
            laser[i] = one;
        }
        int tot = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(laser[j] != 0){
                    tot += laser[i] * laser[j];
                    break;
                }
            }
        }
        return tot;
    }
}