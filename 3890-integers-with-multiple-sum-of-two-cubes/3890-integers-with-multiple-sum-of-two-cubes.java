class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        int limit = (int)Math.cbrt(n);
        for(int i = 1;i <= limit; i++){
            int a = i*i*i;
            for(int j = i; j <= limit; j++){
                int b = j*j*j;
                int x = a+b;
                if(x <= n){
                    freq.put(x,freq.getOrDefault(x,0)+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() >= 2){
                res.add(entry.getKey());
            }
        }
        Collections.sort(res);
        return res;
    }
}