class Solution {
    public String stringHash(String s, int k) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i+=k){
            String sub = s.substring(i,i+k);
            int sum = 0;
            for(int j = 0; j < sub.length(); j++){
                sum += sub.charAt(j) - 'a';
            }
            sum = sum % 26;
            res.append((char)(sum + 'a'));
        }
        return res.toString();
    }
}