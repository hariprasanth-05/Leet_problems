class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] copy = new int[score.length];
        for(int i = 0; i < score.length; i++){
            copy[i] = score[i];
        }
        Arrays.sort(copy);
        for(int i = 0; i < copy.length/2; i++){
            int temp = copy[i];
            copy[i] = copy[copy.length-1-i];
            copy[copy.length-1-i] = temp;
        }

        Map<Integer,String> mpp = new HashMap<>();
        for(int i = copy.length-1; i >= 0; i--){
            if(i == 0) mpp.put(copy[i],"Gold Medal");
            else if(i == 1) mpp.put(copy[i],"Silver Medal");
            else if(i == 2) mpp.put(copy[i], "Bronze Medal");
            else{
                mpp.put(copy[i],String.valueOf(i+1));
            }
        }
        String[] res = new String[score.length];
        for(int i = 0; i < score.length; i++){
            res[i] = mpp.get(score[i]);
        }
        return res;
    }
}