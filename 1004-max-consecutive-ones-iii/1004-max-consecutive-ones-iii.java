class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxlength=0;
        int zerocount=0;
    int left=0;
        for(int i=0; i<nums.length; i++){
           if(nums[i]==0){
            zerocount++;
           }
           while(zerocount>k){
            if(nums[left]==0){
                zerocount--;
            }
            left++;
           }

                maxlength=Math.max(maxlength,i-left+1);


        }
        return maxlength;

    }
}