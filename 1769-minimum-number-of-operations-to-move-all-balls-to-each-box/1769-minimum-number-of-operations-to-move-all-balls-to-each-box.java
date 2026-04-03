class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n]; 
        for(int i = 0; i < n; i++){
            int j = (i+1)%n;
            while(i != j){
                if(boxes.charAt(j) == '1'){
                    res[i] += Math.abs(j - i);
                }
                j = (j+1) % n;
            }
        }
        return res;
    }
}