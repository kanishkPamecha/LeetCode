class Solution {
    public String removeKdigits(String num, int k) {
           Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            
            // Remove larger digits from the stack
            while (!stack.isEmpty() && k > 0 && stack.peek() > current) {
                stack.pop();
                k--;
            }
            
            stack.push(current);
        }
        
        // Remove remaining digits if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // Construct the resulting string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
         if(result.isEmpty())
         return 0+"";
        return result.toString();
    }

}