class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
         int low=1;
         int high=position[position.length-1]-position[0];
         int ans=0;
         while(low<=high){
            int mid=low+(high-low)/2;
            int curr=1;
            int last=position[0];
            boolean check=false;
            for(int i=1; i<position.length; i++){
                if(position[i]-last>=mid){
                    curr++;
                    last=position[i];
                    if(curr==m){
                        check=true;

                    }
                }
            }
            if(check){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

         }

       
       return ans;

    }
}