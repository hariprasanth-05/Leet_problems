class Solution {
    public int mirrorFrequency(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        Map<Character,Character> mirror = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            if(Character.isLetter(ch)){
                char mir = (char)('z'-(ch-'a'));
                if(mirror.isEmpty()){
                    mirror.put(ch,mir);
                }
                if(mirror.containsKey(mir)){
                    if(mirror.get(mir) != ch){
                        mirror.put(ch,mir);
                    }
                }
                else{
                    mirror.put(ch,mir);
                }
            }
            else{
                char mir = (char)('9'-(ch-'0'));
                if(mirror.isEmpty()){
                    mirror.put(ch,mir);
                }
                if(mirror.containsKey(mir)){
                    if(mirror.get(mir) != ch){
                        mirror.put(ch,mir);
                    }
                }
                else{
                    mirror.put(ch,mir);
                }
            }
        }

        int res = 0;
        for(Map.Entry<Character,Character> entry : mirror.entrySet()){
            res += Math.abs(freq.getOrDefault(entry.getKey(),0)-
                            freq.getOrDefault(entry.getValue(),0));
        }
        return res;
    }
}