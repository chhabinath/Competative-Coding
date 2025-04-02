class Solution {
    public String intToRoman(int num) {
        String res = "";
        Map<Integer,String> m = new LinkedHashMap<>();

        m.put(1,"I");
        m.put(4,"IV");
        m.put(5,"V");
        m.put(9,"IX");
        m.put(10,"X");
        m.put(40,"XL");
        m.put(50,"L");
        m.put(90,"XC");
        m.put(100,"C");
        m.put(400,"CD");
        m.put(500,"D");
        m.put(900,"CM");
        m.put(1000,"M");

        int nums[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        for(int value: nums){
            while(num>=value){
                res+=m.get(value);
                num-=value;
            }
        }
        return res;
    }
}