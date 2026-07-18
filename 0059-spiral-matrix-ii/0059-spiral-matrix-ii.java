class Solution {
    public int[][] generateMatrix(int n) {
        int value=1;
        int [][] arr=new int[n][n];
        int top=0;
        int button=n-1; 
        int left=0;
        int right=n-1;
         while (top <= button && left <= right) {
        for(int i=left; i<=right; i++){
            arr[top][i]=value++;
            
        }
        top++;
       for(int i=top; i<=button; i++){
            arr[i][right]=value++;
           
        }
        right--;
        if (top <= button) { 
                for(int i = right; i >= left; i--){
                    arr[button][i] = value++;
                }
                button--;
            }
      
        if (left <= right) {
                for (int i = button; i >= top; i--) {
                    arr[i][left] = value++;
                }
                left++; 
            }
         }
    return arr;
    }
}