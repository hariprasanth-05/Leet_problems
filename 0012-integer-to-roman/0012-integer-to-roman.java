class Solution {
    public String intToRoman(int num) {
        // TreeMap<Integer,String> mpp = new TreeMap<>(Collections.reverseOrder());
        // mpp.put(1,"I");
        // mpp.put(4,"IV");
        // mpp.put(5,"V");
        // mpp.put(9,"IX");
        // mpp.put(10,"X");
        // mpp.put(40,"XL");
        // mpp.put(50,"L");
        // mpp.put(90,"XC");
        // mpp.put(100,"C");
        // mpp.put(400,"CD");
        // mpp.put(500,"D");
        // mpp.put(900,"CM");
        // mpp.put(1000,"M");
        // for(Map.Entry<Integer,String> entry : mpp.entrySet()){
        //     if(num == 0) break;
        //     while(num >= entry.getKey()){
        //         sb.append(entry.getValue());
        //         num -= entry.getKey();
        //     }
        // }
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<values.length; i++){
            if(num == 0) break;
            while(num >= values[i]){
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}