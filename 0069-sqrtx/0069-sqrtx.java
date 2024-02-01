class Solution {
    // Method to find the square root of a given integer using binary search
    public int mySqrt(int x) {

        // Base cases: 0 and 1 are their own square roots
        if (x == 0 || x == 1)
            return x;

        // Initialize the search range
        int first = 1;
        int last = Math.min(x / 2, 46343); // Limit the search range based on the square root of Integer.MAX_VALUE
        int square;

        // Binary search loop
        while (first <= last) {
            square = first + (last - first) / 2; // Calculate the middle point

            // Check if the square of the current value is equal to the given number
            if (square * square == x)
                return square;
            else if ((long)square * (long)square > (long)x)
                // If the square of the current value is greater than the given number,
                // adjust the search range to the left
                last = square - 1;
            else
                // If the square of the current value is less than the given number,
                // adjust the search range to the right
                first = square + 1;
        }

        // If the search range is exhausted, return the square root (rounded to the nearest integer)
        return Math.round(last);
    }
}
