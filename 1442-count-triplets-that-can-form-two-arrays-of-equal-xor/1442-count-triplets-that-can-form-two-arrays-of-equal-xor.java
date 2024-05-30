class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int val=0;
        for(int i=0;i<n-1;i++){
            int ans=0;
            for (int j=i;j<n;j++){
                ans^=arr[j];
                if(ans==0) val+=(j-i);
            }
        }
        return val;
    }
}