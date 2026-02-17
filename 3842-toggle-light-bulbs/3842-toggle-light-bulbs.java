class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        for(int i = 0; i < bulbs.size(); i++){
            freq.put(bulbs.get(i), freq.getOrDefault(bulbs.get(i),0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if((entry.getValue() % 2) == 1){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}