class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int temp=nums[i];
            int sum=0;
            while(temp!=0){
            sum+=temp%10;
            temp/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;

    }
}