class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        } 
        int min = 0;
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            if(entry.getValue() % 2 == 0){
                min += 2;
            }
            else{
                min += 1;
            }
        }
        return min;
    }
}