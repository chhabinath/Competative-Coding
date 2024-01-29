/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int i = 1;
        int num;

        while (i <= n) {
            num = i + (n - i) / 2;
            if (guess(num) == 0) {
                return num;
            }
            if (guess(num) == -1) {
                n = num - 1;
            } else
                i = num + 1;
        }
        return -1;
    }
}