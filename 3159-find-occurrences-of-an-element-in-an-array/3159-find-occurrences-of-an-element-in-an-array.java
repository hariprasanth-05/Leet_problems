class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer,Integer> freq = new HashMap<>();
        int[] ans = new int[queries.length];
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                freq.put(j,i);
                j++;
            }
        }

        for(int i = 0; i < queries.length; i++){
            if(freq.containsKey(queries[i])){
                ans[i] = freq.get(queries[i]);
            }
            else ans[i] = -1;
        }
        
        return ans;




        // int[] ans = new int[queries.length];
        // for(int i = 0; i < queries.length; i++){
        //     int cnt = 0;
        //     int ind = -1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(queries[i] > nums.length)break;
        //         if(nums[j] == x) cnt++;
        //         if(cnt == queries[i]){
        //             ind = j;
        //             break;
        //         }
        //     }
        //     ans[i] = ind;
        // }
        // return ans;



    }
}