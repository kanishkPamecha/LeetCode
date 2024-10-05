class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowMap = new HashMap<>();
        int windowSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (i >= windowSize) {
                char charToRemove = s2.charAt(i - windowSize);
                if (windowMap.get(charToRemove) == 1) {
                    windowMap.remove(charToRemove);
                } else {
                    windowMap.put(charToRemove, windowMap.get(charToRemove) - 1);
                }
            }

            if (freqMap.equals(windowMap)) {
                return true;
            }
        }

        return false;
    }
}
