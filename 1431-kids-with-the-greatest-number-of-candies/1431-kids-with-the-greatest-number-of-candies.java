class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max=candies[0];
        int n=candies.length;
        for(int i=0; i<n; i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0; i<n; i++){
            if(extraCandies+candies[i]>=max){
                ans.add(true);
               
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}