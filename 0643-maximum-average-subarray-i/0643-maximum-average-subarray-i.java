class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum=Integer.MIN_VALUE;
      int start=0;
      int end=k;
      if(nums.length==1){
        return nums[0];
      }
      while(end!=nums.length+1){
        int sum=0;
        for(int i=start; i<end; i++){
            sum+=nums[i];
        }
        if(sum>=maxsum){
            maxsum=sum;
        }
        start++;
        end++;
      }
      double ans=(double)maxsum/k;
      return ans;
    }
}