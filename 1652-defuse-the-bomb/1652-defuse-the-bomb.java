class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        int n = code.length;
        if(k == 0) return res;
        else if(k > 0){
            for(int i = 0; i < n; i++){
                int sum = 0;
                int cnt = 0;
                for(int j = i+1; j < 2*n; j++){
                    if(j % n != i)sum += code[j % n];
                    cnt++;
                    if(cnt == k) break;
                }
                res[i] = sum;
            }
        }
        else{
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = 1; j <= -k; j++){
                    sum += code[(i-j+n)%n];
                }
                res[i] = sum;
            }
        }
        return res;
    }
}