class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        for(int i = 0; i < s.length(); i++){
            if(i == spaces[ind]){
                sb.append(' ');
                if(ind < spaces.length-1)ind++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}