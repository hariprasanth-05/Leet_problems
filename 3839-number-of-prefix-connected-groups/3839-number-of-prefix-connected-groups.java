class Solution {
    public int prefixConnected(String[] words, int k) {
        Arrays.sort(words);
        int n = words.length;
        int l = 0;
        int r = 1;
        int cnt = 0;
        Map<String,Integer> pairs = new HashMap<>();
        while(r < n){
            if(words[l].length() < k || words[r].length() < k ) {
                l = r;
                r++;
                continue;
            }
            String sub1 = words[l].substring(0,k);
            String sub2 = words[r].substring(0,k);
            
            if(sub1.equals(sub2)){
                cnt++;
                while(r < n && words[r].length() >= k && words[r].substring(0,k).equals(sub1)){
                    r++;
                }
                l = r;
                r=l+1;
            }
            else{
                l = r;
                r++;
            }
        }
        return cnt;
    }
}