class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int j = 1;
        int len = flowerbed.length;
        if(len == 1){
            if(flowerbed[i] == 0 && n <= 1)return true;
            return (n == 0);
        }
        
        if(flowerbed[0] == 0 && flowerbed[1] == 0 && n > 0){
            flowerbed[0] = 1;
            n--;
        }
        
        while(j+1 < len && n != 0){
            if(flowerbed[j] == 0){
                if(flowerbed[i] != 1 && flowerbed[j+1] != 1){
                    flowerbed[j] = 1;
                    n--;
                }
            }
            j++;
            i++;
        }
        if(flowerbed[j] != 1 && flowerbed[i] != 1 && n != 0){
            flowerbed[j] = 1;
            n--;
        }
        // for(int k : flowerbed){
        //     System.out.print(k +" ");
        // }
        return (n == 0);
    }
}