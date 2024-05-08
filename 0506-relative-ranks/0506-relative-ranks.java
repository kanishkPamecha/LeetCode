import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOf(score, score.length);
        Integer[] indexes = new Integer[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            indexes[i] = i;
        }
        
        Arrays.sort(indexes, (a, b) -> Integer.compare(score[b], score[a]));
        
        HashMap<Integer, String> ranks = new HashMap<>();
        int r = 1;
        for (int i : indexes) {
            if (r <= 3) {
                switch (r) {
                    case 1:
                        ranks.put(i, "Gold Medal");
                        break;
                    case 2:
                        ranks.put(i, "Silver Medal");
                        break;
                    case 3:
                        ranks.put(i, "Bronze Medal");
                        break;
                }
            } else {
                ranks.put(i, String.valueOf(r));
            }
            r++;
        }
        
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            ans[i] = ranks.get(i);
        }
        return ans;
    }
}
