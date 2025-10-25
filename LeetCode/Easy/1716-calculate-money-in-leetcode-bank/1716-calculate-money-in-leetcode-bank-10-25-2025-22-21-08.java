class Solution {
    public int totalMoney(int n) {
        int money = 1;
        int incMonday = 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
           // System.out.println(money);
            total = total + money++;
            if (i % 7 == 0) {
                //total = total + money;
                money = ++incMonday;
            }
        }
        return total;
    }
}