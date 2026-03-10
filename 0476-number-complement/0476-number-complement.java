class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1') sb.append('0');
            else sb.append('1');
        }
        int res = 0;
        int pow = 0;
        int i = sb.length()-1;
        while(i >= 0){
            if(sb.charAt(i) == '1') res += Math.pow(2,pow);
            pow++; 
            i--;
        }
        return res;
    }
}
