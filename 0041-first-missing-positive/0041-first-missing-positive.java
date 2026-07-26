class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==k){
                k++; 
            }

           
        }
        return k;
    }
}