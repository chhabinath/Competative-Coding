class Solution {
    public int[] getNoZeroIntegers(int n) {
        int res[] = new int[2];
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            a = i;
            b = n - i;
            if (a + b == n && checkNonZero(a) && checkNonZero(b)) {
                res[0] = a;
                res[1] = b;
                break;
            }
        }

        return res;
    }

    private boolean checkNonZero(int n) {
       while(n>0){
        if(n%10 == 0)
            return false;
        n/=10;
       }
       return true;
    }
}