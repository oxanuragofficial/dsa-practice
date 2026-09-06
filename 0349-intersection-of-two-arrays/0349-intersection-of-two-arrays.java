class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
           
            }
        }
    ArrayList<Integer> list = new ArrayList<>(res);
        int [] ans=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}