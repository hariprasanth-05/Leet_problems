class Solution {
    public boolean uniformArray(int[] n1) {
        int n = n1.length;
        Arrays.sort(n1);
        int[] n2 = new int[n];
        boolean res = true;
        if(n1[0] % 2 == 0){
            for(int i = 1; i < n; i++){
                if(n1[i] % 2 == 0) continue;
                else{
                    int diff = n1[i]-n1[0];
                    if(diff >= 1 && diff % 2 != 0){
                        res = false;
                        break;
                    } 
                }
            }
        }
        else{
            for(int i = 1; i < n; i++){
                if(n1[i] % 2 == 1) continue;
                else{
                    int diff = n1[i]-n1[0];
                    if(diff >= 1 && diff % 2 != 1 ){
                        res = false;
                        break;
                    } 
                }
            }
        }
        return res;

        // int n = nums1.length;
        // int cntOdd = 0;
        // int cntEve = 0;
        // for(int i = 0; i < n; i++){
        //     if((nums1[i] & 1) == 1){
        //         cntOdd++;
        //     }else{
        //         cntEve++;
        //     }
        // }
        // if(cntEve == cntOdd){
        //     return false;
        // }
        // else return true;


        // int n = nums1.length;
        // if(n < 2) return true;
        // Arrays.sort(nums1);
        // for(int i = 0; i < n; i++){
        //     int cnt = 0;
        //     for(int j = i+1; j < n ;j = j%n){
        //         if(i != j && (nums1[j] - nums2[i]) >= 1){

        //         }
        //     }
        // }
    }
}