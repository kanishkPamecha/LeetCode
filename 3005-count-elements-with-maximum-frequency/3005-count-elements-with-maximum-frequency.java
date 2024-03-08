class Solution {
    public int maxFrequencyElements(int[] nums) { 
        if(nums.length==1)return 1;
      Arrays.sort(nums); 
      int freq =0; int ans =0; 
      int []frequency = new int [nums.length]; 
       frequency[0]=1;
      for(int i =1 ;i< nums.length ;i++)
      {
    
          if(nums[i-1]==nums[i]) {frequency[i] = frequency [i-1]+1;}
          else frequency[i] =1;
      }  
      
    for (int i = 0; i < nums.length; i++) { 
    if (frequency[i] > freq) { 
        freq = frequency[i];
        ans = freq;
    } else if (frequency[i] == freq) { 
        ans += freq;
    }
}

          

      
return ans;
    }
}