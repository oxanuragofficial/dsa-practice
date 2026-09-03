class Solution {
    public int splitArray(int[] nums, int k) {
       int left=0;
       int right=nums[0];
       int n=nums.length;
       
       for(int i=0; i<n; i++){
        left=Math.max(left,nums[i]);
        right+=nums[i];
       } 
    int ans=right;
       while(left<=right){
        int mid=left+(right-left)/2;
        int sum=0;
        int count=1;
for(int i=0; i<n; i++){
        if(sum+nums[i]>mid){
            count++;
            sum=nums[i];

        }
        else{
            sum+=nums[i];
        }
}

        if(count<=k){
            ans=mid;
            right=mid-1;
        }
        else{
            left=mid+1;
        }
       }
       return ans;
    }
}