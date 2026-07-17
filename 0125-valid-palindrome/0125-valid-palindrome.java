class Solution {
    public boolean isPalindrome(String s) {
        
           s = s.toLowerCase(); 

        ArrayList<Character> result = new ArrayList<>();
       
         for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
              if (c >= 'a' && c <= 'z'|| (c >= '0' && c <= '9')) {
                    result.add(c);
            }
        }
         
        int left = 0;
        int right = result.size() - 1;
        
       
        while (left < right) {
            if (result.get(left) != result.get(right)) {
                return false;
            }
            left++;
            right--; 
        }
        return true;
    }
}