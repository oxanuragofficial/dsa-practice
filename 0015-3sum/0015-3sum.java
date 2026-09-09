class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;

        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int j=i+1;
            int k=n-1;
            while(j<k){
                List<Integer> ans=new ArrayList<>();
                long sum=(long) nums[i]+nums[j]+nums[k];
               
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return result;

    }
}