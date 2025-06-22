class Solution {
    public String[] divideString(String s, int k, char fill) {
        int totalGroups = (s.length() + k - 1) / k; // ceiling division
        StringBuilder sb = new StringBuilder(s);

        // Pad the string to make its length a multiple of k
        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        // Stream over group indices and map to substrings of length k
        return IntStream.range(0, totalGroups)
                .mapToObj(i -> sb.substring(i * k, (i + 1) * k))
                .toArray(String[]::new);
    }
}
