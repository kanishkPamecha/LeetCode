class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] temp =  arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> ans = new HashMap<>();
        int count =1;
        for(int i =0 ;i<arr.length ;i++)
        { 
            if(!ans.containsKey(temp[i]))
            ans.put(temp[i],count++);
        } 
        int [] anarr = new int [arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            anarr[i]= ans.get(arr[i]);
        }
        return anarr;
    }
}