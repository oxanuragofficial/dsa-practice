class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int maxcount=0;
        int index=0;
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                boolean isMatch = true;
                for(int k=0; k<n; k++){
                if(grid[i][k]!=grid[k][j]){
                    isMatch = false;
                    break;
                }
               
                }

                 if (isMatch) {
                    maxcount++;
                }
            }
            
          
        }
        return maxcount;
    }
}