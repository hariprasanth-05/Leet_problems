class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int ind = 0;
        for(int i = 0; i < order.length; i++){
            int flag = 0;
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                res[ind++] = order[i]; 
            }
        }
        return res;
    }
}