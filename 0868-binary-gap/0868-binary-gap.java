class Solution {
    public int binaryGap(int n) {
        int max = Integer.MIN_VALUE;
        String bin = Integer.toBinaryString(n);
        int j = 0;
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '0') continue;
            j= i+1;
            boolean flag = false;
            while(j < bin.length()){
                if(bin.charAt(j) == '1'){
                    flag = true;
                    break;
                }
                j++;
            }
            if(flag) max = Math.max(max,j-i);
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}