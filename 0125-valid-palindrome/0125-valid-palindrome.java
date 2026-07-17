class Solution {
    public boolean isPalindrome(String s) {
        
           s = s.toLowerCase(); 

        StringBuilder result = new StringBuilder();
       
         for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
              if (c >= 'a' && c <= 'z'|| (c >= '0' && c <= '9')) {
                    result.append(c);
            }
        }
         
        int left = 0;
        int right = result.length() - 1;
        
       
        while (left < right) {
            if (result.charAt(left) != result.charAt(right)) {
                return false;
            }
            left++;
            right--; 
        }
        return true;
    }
}