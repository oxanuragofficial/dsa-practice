class Solution {
    public int longestSubarray(int[] nums) {
       
int maxcount=0;
for(int j=0; j<nums.length; j++){
 int zerocount=1;
int count=0;
for(int i=j; i<nums.length; i++){
    if(nums[i]==0) zerocount--;
    
    if(nums[i]==1) count++;
    
    if(zerocount<0) break;
    
    }
    if(maxcount<count && zerocount==1){
        maxcount=count-1;
    }
    else if(maxcount<count){
        maxcount=count;
    }
}
    return maxcount;
    
    }
}