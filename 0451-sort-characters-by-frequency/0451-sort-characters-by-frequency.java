class Solution {
    public String frequencySort(String s) {
        List<Character>[] bucket = new List[s.length()+1];
        Map<Character,Integer> freqmpp = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqmpp.put(ch, freqmpp.getOrDefault(ch,0)+1);
        }

        for(char key : freqmpp.keySet()){
            int val = freqmpp.get(key);
            if(bucket[val] == null){
                bucket[val] = new ArrayList<>();
            }
            int num = val;
            while(num > 0){
                bucket[val].add(key);
                num--;
            }
            
        }

        StringBuilder res = new StringBuilder();
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(Character j:bucket[i]){
                    res.append(j);
                }
            }
        }
        return res.toString();
    }
}