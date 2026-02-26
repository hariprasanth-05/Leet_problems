class Solution {
    public int maxDistinct(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        return freq.size();
    }
}