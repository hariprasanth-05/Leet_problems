class Solution {
    public boolean isDigitorialPermutation(int n) {
        int finalsum = 0;
        int copy = n;
        Map<Integer,Integer> mpp = new HashMap<>();
        while(copy > 0){
            int last = copy % 10;
            mpp.put(last,mpp.getOrDefault(last,0)+1);
            copy /= 10;
        }
        copy = n;
        while(copy > 0){
            int last = copy % 10;
            long sum = 1;
            for(int i = 1; i <= last; i++){
                sum *= i;
            }
            finalsum += (long)sum;
            copy /= 10;
        }
        copy = finalsum;
        while(copy > 0){
            int last = copy % 10;
            mpp.put(last,mpp.getOrDefault(last,0)-1);
            if(mpp.get(last) == 0) mpp.remove(last);
            copy /= 10;
        }
        return (finalsum == n || mpp.size() == 0);
    }
}