class Solution {
    public int[] runningSum(int[] nums) {
int n=nums.length;
int [] arr=new int[n];
arr[0]=nums[0];
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+nums[i];
        }

        return arr;
    }
}