class Solution {
    public int[] sortedSquares(int[] nums) {
     for(int i=0; i<nums.length; i++){
        int s=nums[i]*nums[i];
        nums[i]=s;
     } 
     Arrays.sort(nums); 

     return nums; 
    }
}