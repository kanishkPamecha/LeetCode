class Solution {

    public int [][] flood (int [][]images, int original, int sr, int sc, int color)
    {
        if(sc<0 || sc>= images[0].length || sr <0 || sr>=images.length ){return images ;}
        if(original==images[sr][sc]&& color!=images[sr][sc])
        {
            images[sr][sc]=color;
            flood(images,original,sr-1,sc,color);
            flood(images,original,sr+1,sc,color);
            flood(images,original,sr,sc-1,color);
            flood(images,original,sr,sc+1,color);
        }
        if(original!=images[sr][sc])return images;
        return images;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
           
         int originalColors = image[sr][sc];
            
      return flood(image,originalColors,sr,sc,color);
    }
}