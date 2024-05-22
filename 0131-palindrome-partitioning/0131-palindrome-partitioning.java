import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> sub(String s, int idx, List<String> ans, List<List<String>> result) {    
        if (idx == s.length()) {
            result.add(new ArrayList<>(ans));
            return result;
        }
        
        for (int i = idx; i < s.length(); i++) {
           
            if (ispalindrome(s.substring(idx, i + 1))) {
                ans.add(s.substring(idx, i + 1)); 
                sub(s, i + 1, ans, result); 
                ans.remove(ans.size() - 1); 
            }
        }
        return result;
    }

    
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        sub(s, 0, ans, result);
        return result;
    }

  
    public boolean ispalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}