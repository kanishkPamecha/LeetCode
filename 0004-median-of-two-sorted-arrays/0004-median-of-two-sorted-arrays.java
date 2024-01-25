class Solution {
   int [] Merge ( int []n, int []m)
    {
        int n1 = n.length;
        int n2 = m.length;
        int []Sorted = new int [n1+n2];
       int i=0,j=0,k=0;
        while( i<n1 &&  j < n2)
        {
             if(n[i]<m[j])
             {
                 Sorted[k++]=n[i++];
             }
             else {
                   {
                 Sorted[k++]=m[j++];

             }
             }
        }
        while(i<n1)
        {
             Sorted[k++]=n[i++];

        }
          while(j<n2)
        {
             Sorted[k++]=m[j++];

        }
        return Sorted;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int []Sorted =   Merge(nums1,nums2);
    double a = Sorted.length ;
     double b;
    int  c=(int )a %2;
    if (c==0)
       {
            b =  Sorted[(int)a/2]+Sorted[(int)(a/2)-1];
        b=b/2;
        
      
       }
       else
       {
               b =  Sorted[(int)((a/2))];
       
       }
           return b;
    }
}