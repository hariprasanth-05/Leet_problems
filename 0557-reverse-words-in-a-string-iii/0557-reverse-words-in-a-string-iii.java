class Solution {
    public String reverseWords(String s) {
        String[] ch = s.split(" ");
        for(int i = 0; i < ch.length; i++){
            StringBuilder sub = new StringBuilder(ch[i]);
            ch[i] = sub.reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++){
            sb.append(ch[i]+" ");
        }
        return sb.toString().trim();
    }
}