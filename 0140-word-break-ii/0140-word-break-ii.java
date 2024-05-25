class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        set.addAll(wordDict);
        List<String> list = new ArrayList<>();
        List<String> words = new ArrayList<>();        
        dfs(s, 0, set, list, words);
        return list;
    }

    public void dfs(String s, int i, Set<String> set, List<String> list, List<String> words) {
        if (i == s.length()) {
            list.add(String.join(" ", words));
            return;
        }
        for (int j = i + 1; j <= s.length(); j++) {
            String word = s.substring(i, j);
            if (set.contains(word)) {
                words.add(word);
                dfs(s, j, set, list, words);
                words.remove(words.size() - 1);
            }
        }
    }
}