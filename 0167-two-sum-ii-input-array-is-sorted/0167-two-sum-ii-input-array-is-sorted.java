class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] arr=new int[2];
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(numbers[left]+numbers[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
}