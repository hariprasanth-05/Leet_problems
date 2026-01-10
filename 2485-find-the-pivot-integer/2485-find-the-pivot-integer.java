class Solution {
    public int pivotInteger(int n) {
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] += prefix[i-1]+ i+1;

        }

        suffix[n-1] = n;
        int num = n-1;
        for(int i=n-2; i>=0; i--){
            suffix[i] += suffix[i+1]+ (num--);
        }
        
        int res = -1;
        for(int i=0; i<n; i++){
            if(prefix[i] == suffix[i]){
                res = i+1;
                break;
            }
        }
        return res;
    }
}