class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        

        if(digits[l-1] < 9){
            digits[l-1] = digits[l-1] + 1;
            return digits;
        }

        int i;
        for(i = l - 1; i > 0;i--)
        {
            if(digits[i] == 9){
                digits[i] = 0;
                if(digits[i-1] < 9)
                {
                    digits[i-1] = digits[i-1] + 1;
                    return digits;
                }
            }
           
        }

    int result[] = new int[l+1];
        if(i==0){
            result[0] = 1;
        }

        return result;
    }

}