class Solution {
    class INM{
        int x ; 
        int y;
        float z;
        public INM(int x, int y ){
   this.x=x;
   this.y=y;
   this.z =x/y;
        }
    }
public static class studentComp implements Comparator<INM> {
    public int compare(INM s1, INM s2) {
        long num1 = s1.x * s2.y;
        long num2 = s2.x * s1.y; 

        return Long.compare(num1, num2);
    }
}

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<INM> n1 = new PriorityQueue<>( new studentComp());
        int n =  arr.length;
   for(int i =0 ;i<n-1 ;i++)
   {
    for(int j =i+1 ;j< n ;j++)
    {
        INM a = new INM(arr[i],arr[j]);
        n1.add(a);
    }

   }
   for(int i =0 ;i< k-1 ;i++)
   {
    n1.remove();
   }
  int []ll = new int[2];
  ll[0]=n1.peek().x;
  ll[1]= n1.peek().y;
  return ll;
    }
}