class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLength = 0;
        int left = 0;
        int currentCost = 0;

        for (int right = 0; right < s.length(); right++) {
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));

            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
