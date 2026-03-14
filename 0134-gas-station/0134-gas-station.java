class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        if(n==1 && cost[0] == gas[0])return 0;
        for(int i = 0; i < n; i++){
            if(gas[i] <= cost[i]){
                continue;
            }
            int tank = 0;
            int cnt = 0;
            // int j = 0;
            for(int j = i; j < i+n; j++){
                tank += gas[j%n] - cost[j%n];
                cnt++;
                if(tank < 0) break;
                if(cnt == n){
                    return i;
                }
            }
        }
        return -1;
    }
}