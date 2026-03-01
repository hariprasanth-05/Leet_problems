class Solution {
    public String mergeCharacters(String s, int k) {
        Map<Character,Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i < sb.length()){
            if(freq.containsKey(sb.charAt(i))){
                int ind = freq.get(sb.charAt(i));
                if((i - ind) <= k){
                    sb.deleteCharAt(i);
                }
                else{
                    freq.put(sb.charAt(i),i);
                    i++;
                }
            }
            else{
                freq.put(sb.charAt(i),i);
                i++;
            }
        }
        return sb.toString();
    }
}