class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i = m ;i< m+n ;i++)
      {
        
        nums1[i]=nums2[i-m];

      }
      Arrays.sort(nums1);
    }
}
//  Another Approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i =0 ;int j =0;
      int k =0;
      int []arr = new int [m+n];
      while(i<m && j<n)
      {
        if(nums1[i]<nums2[j]){arr[k++]=nums1[i++];}
        else {arr[k++]=nums2[j++];}
      }
   while(i<m){ arr[k++]=nums1[i++];}
   while(j<n){ arr[k++]=nums2[j++];}
    
    for(int l=0;l<arr.length ; l++)
    {
        nums1[l]=arr[l];
    }
    }
}
