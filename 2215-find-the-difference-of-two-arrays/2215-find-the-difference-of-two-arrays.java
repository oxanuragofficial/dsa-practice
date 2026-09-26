class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
          HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        List<Integer> list1=new ArrayList<>();
        ArrayList<Integer> set1List = new ArrayList<>(set1);
        for(int i=0; i<set1.size(); i++){
            if(!set2.contains(set1List.get(i))){
                list1.add(set1List.get(i));
            }
        }
        List<Integer> list2=new ArrayList<>();
        ArrayList<Integer> set2List = new ArrayList<>(set2);
        for(int i=0; i<set2.size(); i++){
            if(!set1.contains(set2List.get(i))){
                list2.add(set2List.get(i));
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}