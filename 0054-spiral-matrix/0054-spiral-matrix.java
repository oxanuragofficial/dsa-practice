import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return ans;
        }
        
        int n = matrix.length;      
        int m = matrix[0].length;     
        
        int top = 0;
        int buttom = n - 1;
        int left = 0; 
        int right = m - 1;            
        
        while (top <= buttom && left <= right) {
            
           
            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;
            
           
            for (int i = top; i <= buttom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            
            
            if (top <= buttom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[buttom][j]);
                }
                buttom--;
            }
            
          
            if (left <= right) {
                for (int i = buttom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }   
        
        return ans; 
    }
}
