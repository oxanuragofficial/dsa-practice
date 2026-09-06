class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length; 
       int [] ans=new int[n+n];
       for(int i=0; i<n; i++){
            ans[i]=nums[i];
       }
      int index=n;
       for(int i=0; i<n; i++){
            ans[index]=nums[i];
            index++;
       }  
       return ans;
    }
}