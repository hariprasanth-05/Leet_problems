class Solution {
    public String reverseStr(String s, int k) {
        int len = s.length();
        if(len < k){
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
        char[] ch = s.toCharArray();
        for(int i = 0; i < len; i+=2*k){
            int l = i;
            int r = Math.min(i + k - 1, len - 1);
            while(l < r){
                char temp = ch[r];
                ch[r] = ch[l];
                ch[l] = temp;
                l++;
                r--;
            }
        }
        String str = new String(ch);
        return str;
    }
}