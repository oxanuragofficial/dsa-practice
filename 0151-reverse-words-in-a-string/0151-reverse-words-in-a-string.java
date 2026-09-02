class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=s.length()-1;

        StringBuilder sb = new StringBuilder();

        while (left <= right && s.charAt(left) == ' ') { 
            left++; 
            }
        while (right >= left && s.charAt(right) == ' ') { 
            right--; 
            }
            int i=right;
            while(i>=left){

                StringBuilder sb1 = new StringBuilder();
                while (i >= left && s.charAt(i) == ' ') { 
                    i--; 
                    }

                while(i>=left && s.charAt(i)!=' '){
                    sb1.append(s.charAt(i));
                    i--;
                }
                sb.append(sb1.reverse());
                if(i>=left){
                    sb.append(' ');
                }


            }


        

       return sb.toString();
    }
}