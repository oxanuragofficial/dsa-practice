class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int [][] ans=new int [n+1][m+1];
        for(int i=0; i<=n; i++) ans[i][0]=i;
        for(int i=0; i<=m; i++) ans[0][i]=i;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                }
                    else{
                        int topleft=ans[i-1][j-1];
                        int top=ans[i-1][j];
                        int left=ans[i][j-1];
                        ans[i][j]=Math.min(topleft,Math.min(top,left))+1;
                    

                }
            }
        
        }
        return ans[n][m];
    }
}