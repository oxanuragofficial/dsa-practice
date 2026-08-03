class Solution {
    public void sortColors(int[] nums) {
       int zc=0;
        int oc=0;
        int tc=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zc++;
            }
            else if(nums[i]==1){
                oc++;
            }
            else tc++;
        } 
        for(int i=0; i<nums.length; i++){
            if(i<zc) nums[i]=0;
            else if(i<(zc+oc)) nums[i]=1;
            else nums[i]=2;
        }
    }
}