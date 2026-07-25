class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        
        int watermax=0;
        while(left<right){
            int width=right-left;
          int smallest = Math.min(height[left],height[right]);
           int max=smallest*width;

            if(max>watermax){
                watermax=max;

            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }



        }
        return watermax;
    }
}