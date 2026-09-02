class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
     
     
       int even = (n + 1) / 2; 
        int odd = n / 2;
        int [] oarr=new int[odd];
        int [] earr=new int[even];
        int oi=0;
        int ei=0;
        for(int i=0; i<n; i++){
            if(i%2!=0){
              oarr[oi]=nums[i];
              oi++;
            }
            else{
                earr[ei]=nums[i];
                ei++;
            }
        }

        for (int i = 0; i < odd; i++) {
            for (int j = 1; j < (odd- i); j++) {
                
                if (oarr[j - 1] < oarr[j]) {
                    int temp = oarr[j - 1];
                    oarr[j - 1] = oarr[j];
                    oarr[j] = temp;
                }
            }
        }
    
    
        for (int i = 0; i < even; i++) {
            for (int j = 1; j < (even- i); j++) {
                
                if (earr[j - 1] > earr[j]) {
                    int temp = earr[j - 1];
                    earr[j - 1] = earr[j];
                    earr[j] = temp;
                }
            }
        }
    
            oi=0;
            ei=0;

            for(int i=0; i<n; i++){
                if(i%2==0){
                    nums[i]=earr[ei];
                    ei++;
                }
                else{
                    nums[i]=oarr[oi];
                    oi++;
                }
            }

        return nums;
    }
}