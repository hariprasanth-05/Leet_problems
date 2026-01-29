class Solution {
    public String reversePrefix(String word, char ch) {
        char[] w = word.toCharArray();
        int r = 0;
        while(r < w.length){
            if(w[r] == ch)break;
            r++;
        }
        if(r == w.length) return word;
        int l = 0;
        while(l < r){
            char temp = w[l];
            w[l] = w[r];
            w[r] = temp;
            l++;
            r--;
        }
        String str = new String(w);
        return str;
    }
}