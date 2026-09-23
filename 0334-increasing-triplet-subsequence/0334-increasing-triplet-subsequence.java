class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE;
       int sec=Integer.MAX_VALUE;

       for(int i=0; i<nums.length; i++){
        if(nums[i]<=first){
            first=nums[i];
        }
        else if(nums[i]<=sec){
            sec=nums[i];
        }
        else{
            return true;
        }
       }
       return false;

    }
}