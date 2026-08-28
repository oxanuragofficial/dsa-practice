class Solution {
    public int[][] divideArray(int[] nums, int k) {

       
            Arrays.sort(nums);
            int n=3;
            int m=nums.length/3;
            int index=0;
    int [][] ans=new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(nums[i * 3 + 2] - nums[i * 3] <=k){
                ans[i][j]=nums[index];
                index++;
            }
            else return new int[][] {};
        }
    }
        
        return ans;
    }
}