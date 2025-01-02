class Solution {
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private boolean isVowelString(String s) {
        return s.length() > 0 && isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n + 1];

        // Build the prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + (isVowelString(words[i]) ? 1 : 0);
        }

        int[] result = new int[queries.length];

        // Answer each query using the prefix sum array
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixSum[ri + 1] - prefixSum[li];
        }

        return result;
    }
}
