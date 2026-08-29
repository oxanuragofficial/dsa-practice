class Solution {
    public int[] productExceptSelf(int[] nums) {
     
        int ans=0;
            int left=1;
        int right=1;
        int [] arr=new int[nums.length];
       for(int i=0; i<nums.length; i++){
       

        arr[i]=left;
        left*=nums[i];
       }
       for(int i=nums.length-1; i>=0; i--){
        arr[i]*=right;
        right*=nums[i];
       }
        
        return arr;
    }
}