class Solution { 
    public void Swap (int i , int j , char[]arr)
    {
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    public String reversePrefix(String word, char ch) {
        
        char []arr = word.toCharArray();
         int a =0;
         for(int i = 0 ; i< arr.length ;i++)
         {
            if(arr[i]==ch){a=i; break;}
         }
           int i =0;
           int j =a; 
            while(i<j)
            {
               Swap(i,j,arr);
               i++;
               j--;
            }
 String str = new String(arr);
  return str;
    }
}