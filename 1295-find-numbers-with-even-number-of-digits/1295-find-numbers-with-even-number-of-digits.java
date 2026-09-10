class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int main=0;
        for(int i=0; i<n; i++){
            int first=nums[i];
            int count=0;
            while(first!=0){
                count++;
                first/=10;
            }
            if(count%2==0){
                main++;
            }
        }
        return main;
    }
}