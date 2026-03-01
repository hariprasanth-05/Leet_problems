class Solution {
    public String maximumXor(String s, String t) {
        
        Map<Integer,Integer> t_freq = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            t_freq.put(t.charAt(i)-'0', t_freq.getOrDefault(t.charAt(i)-'0',0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                if(t_freq.containsKey(1)){
                    sb.append('1');
                    t_freq.put(1, t_freq.getOrDefault(1,0)-1);
                    if(t_freq.get(1) == 0){
                        t_freq.remove(1);
                    }
                }
                else{
                    sb.append('0');
                    t_freq.put(0, t_freq.getOrDefault(0,0)-1);
                    if(t_freq.get(0) == 0){
                        t_freq.remove(0);
                    }
                }
            }
            else{
                if(t_freq.containsKey(0)){
                    sb.append('1');
                    t_freq.put(0, t_freq.getOrDefault(0,0)-1);
                    if(t_freq.get(0) == 0){
                        t_freq.remove(0);
                    }
                }
                else{
                    sb.append('0');
                    t_freq.put(1, t_freq.getOrDefault(1,0)-1);
                    if(t_freq.get(1) == 0){
                        t_freq.remove(1);
                    }
                }
            }
        }

        return sb.toString();
    }
}