class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        if(n < 2) return true;
        int j = 0;
        int cnt = 0;
        while(j < n-1){
            if(s.charAt(j) == '1' && s.charAt(j+1) == '0'){
                cnt++;
            }
            j++;
        }
        if(s.charAt(n-1) == '1'){
            cnt++;
        }
        if(cnt > 1) return false;
        return true;

    }
}