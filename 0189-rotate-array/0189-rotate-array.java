class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
          k = k % n;
        int index=n-k;
        int a=0;
        int []temp=new int[n];
        for(int i=0; i<n; i++){
            temp[i]=nums[i];
        }
        for(int i=0; i<k; i++){
            nums[i]=temp[index];
            index++;
        }
        for(int i=k; i<n; i++){
            nums[i]=temp[a];
            a++;

        }
    }
}