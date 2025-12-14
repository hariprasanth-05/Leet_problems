class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[n-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<first.length; i++){
            if(first[i] == last[i]){
                sb.append(first[i]);
            }
            else break;
        }
        return sb.toString();
    }
}