class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n =deck.length;
        int []ans = new int [n];
        Arrays.sort(deck);
         int j =1;
    Arrays.fill(ans,-1);
    ans[0]=deck[0];
    int i =1;
    int count =0;
    while(j<n)
    { 
        
        if(ans[i%n]==-1)
        { 
            if(count == 1 )
            {
                  ans[i%n] = deck[j++];  
                  count =0;
            }
            else{
                count++;   
            }
            
        }
        i++;
        
    }
    return ans;
    }
}