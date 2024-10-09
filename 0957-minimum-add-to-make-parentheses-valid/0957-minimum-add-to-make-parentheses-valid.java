class Solution {
    public int minAddToMakeValid(String s) {
        int a =0;
        int count =0;
        for(char c : s.toCharArray())
        {
            if(c=='('){count++;}
            if(c==')') {
                if(count>0) {count--;}
            else {a++;}
        }
        }
        if(count>0) a+=count;
        return a;
    }
}