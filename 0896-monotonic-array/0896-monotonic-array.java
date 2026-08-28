class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ans1=true;
        boolean ans2=true;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                ans1=false;
            }
            if(nums[i-1]<nums[i]){
                ans2=false;
            
            }
        }
        
        return ans1 || ans2;
    }
}