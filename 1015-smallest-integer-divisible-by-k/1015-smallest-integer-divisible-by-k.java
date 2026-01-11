class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }
        int remian = 0;
        for(int i=1; i <= k; i++){
            remian = (remian * 10 + 1) % k;
            if(remian == 0){
                return i;
            }
        }
        return -1;
    }
}