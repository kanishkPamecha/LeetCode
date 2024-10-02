class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0;
	   int count=0;
	   for(int i=0;i<s.length();i++){
	       HashSet<Character> set=new HashSet<>();
	       count=0;
	       for(int j=i;j<s.length();j++){
	           char ch=s.charAt(j);
	           if(!set.contains(ch)){
	               count++;
	               max=Math.max(max,count);
	           }
	           else{
	               break;
	           }
	           set.add(ch);
	       }
	   }
	   return max;
    }}
