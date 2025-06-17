class Solution {
    final int MOD = 1_000_000_007;

    public int countGoodArrays(int n, int m, int k) {
        long[] factorial = new long[n];
        long[] invFactorial = new long[n];

        factorial[0] = 1;
        for(int i = 1;i<n;i++){
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        invFactorial[n-1] = modPow(factorial[n-1], MOD -2);
        for(int i = n-2;i>=0;i--){
            invFactorial[i] = (invFactorial[i+1]* (i+1)) % MOD;
        } 

        long nck = factorial[n-1];
        nck = (nck * invFactorial[k]) % MOD;
        nck = (nck * invFactorial[n-1-k]) % MOD;

        long power = modPow(m-1,n-1-k);
        long result = (m*power)%MOD;

        return (int)((nck * result) % MOD);
    }
    private long modPow(long base, long exp){
        long result = 1;
        base %= MOD;

        while(exp > 0){
            if((exp &1)==1){
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp>>=1;

        }
        return result;
    }
}