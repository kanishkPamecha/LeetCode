class Solution {
    public int minimumPushes(String word) {
        // Step 1: Calculate character frequencies
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        // Step 2: Sort frequencies in descending order
        Arrays.sort(freq);
        
        // Step 3: Calculate the minimum number of pushes
        int presses = 0;
        int keyPressCount = 1;
        int keyPressIndex = 2;
        
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                break;
            }
            presses += freq[i] * keyPressCount;
            keyPressIndex++;
            if (keyPressIndex > 9) {
                keyPressIndex = 2;
                keyPressCount++;
            }
        }
        
        return presses;
    }
}