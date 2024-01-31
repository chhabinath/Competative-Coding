class Solution {
    // Method to check if a given number is a perfect square
    public boolean isPerfectSquare(int num) {
        // Initialize the search range
        int first = 1;
        int last = Math.min(num / 2, 46340); // Limit the search range based on the square root of Integer.MAX_VALUE
        int mid;

        // Check if the given number is 1, which is a perfect square
        if (num == 1)
            return true;

        // Binary search loop
        while (first <= last) {
            mid = first + (last - first) / 2; // Calculate the middle point

            // Check if the square of mid is equal to the given number
            if (mid * mid == num)
                return true;

            // If the square of mid is greater than the given number, adjust the search
            // range to the left
            if (mid * mid > num)
                last = mid - 1;
            else
                // If the square of mid is less than the given number, adjust the search range
                // to the right
                first = mid + 1;
        }

        // If the search range is exhausted and the perfect square is not found, return
        // false
        return false;
    }
}
