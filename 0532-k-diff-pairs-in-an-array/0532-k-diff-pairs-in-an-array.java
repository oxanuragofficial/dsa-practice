class Solution {
    public int findPairs(int[] nums, int k) {

        if(k<0) return 0;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int count=0;
       for(int i=0; i<n; i++){
        int num=nums[i];
        if(set1.contains(num-k)){
            set.add(num-k);

        }
        if(set1.contains(num+k)){
            set.add(num);
        }
        set1.add(num);
       }
        return set.size();
    }
}