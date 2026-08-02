class Solution {
    public int jump(int[] nums) {
        int j=0;
        int count=0;
        int last=0;
        if(nums.length<=1) return count;
        for(int i=0; i<nums.length; i++){

            last=Math.max(last,i+nums[i]);
            if(i==j){
                count++;
                j=last;
            }
            if(j>=nums.length -1){
                break;
            }
        }
        return count;
    }
}