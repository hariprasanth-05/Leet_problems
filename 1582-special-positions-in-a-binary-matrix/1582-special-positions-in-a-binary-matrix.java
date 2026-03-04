class Solution {
    public int numSpecial(int[][] mat) {
        int cnt = 0;
        int n = mat.length;
        int m = mat[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int cnt1 = 0;
            int ind = 0;
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    cnt1++;
                    ind = j;
                }
            }
            if(cnt1 == 1){
                list.add(ind);
            }
        }
        for(int i = 0; i < list.size(); i++){
            int cnt1 = 0;
            for(int j = 0; j < n; j++){
                if(mat[j][list.get(i)] == 1){
                    cnt1++;
                }
            }
            if(cnt1 == 1){
                cnt++;
            }
        }
        return cnt;
    }
}