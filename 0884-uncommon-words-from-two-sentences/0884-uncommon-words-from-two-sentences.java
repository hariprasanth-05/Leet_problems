class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> freq = new HashMap<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for(String s : str1){
            freq.put(s, freq.getOrDefault(s,0)+1);
        }
        for(String s : str2){
            freq.put(s, freq.getOrDefault(s,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        String[] res = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}