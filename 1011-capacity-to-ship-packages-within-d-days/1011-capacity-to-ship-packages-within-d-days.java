class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int maxsum=0;
            int max=0;
        for(int i=0; i<weights.length; i++){
            max=Math.max(max,weights[i]);
            maxsum+=weights[i];
        }
        int left=max;
        int right=maxsum;
        while(left<right){
            int mid=left+(right-left)/2;
            int sum=0;
            int d=1;
        for(int i=0; i<weights.length; i++){
            if(sum+weights[i]>mid){
                    d++;
                    sum=0;
            }
            sum+=weights[i];
        }
        if(d<=days){
            right=mid;
        }
        else{
            left=mid+1;
        }
        

        }
        return left;
    }
}