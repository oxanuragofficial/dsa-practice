class Solution {
    public int myAtoi(String s) {
    int i=0;
    int number=0;
    int digit=0;
    int sign=1;
    char ch;
    int n=s.length();

    while(i<n && s.charAt(i)==' '){
        i++;
    }
    if(i<n&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
        if(s.charAt(i)=='-') sign=-1;
        i++;
    }
    while(i<n&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
       ch=s.charAt(i);
       digit=ch-'0';
        if (number > Integer.MAX_VALUE / 10 || (number == Integer.MAX_VALUE / 10 && digit > 7)) {
                if (sign == 1) {
                         return Integer.MAX_VALUE; // Returns 2147483647
            }         
                else {
                        return Integer.MIN_VALUE; // Returns -2147483648
                      }
             }
       number=(number*10)+digit; 
       i++;
    }
    return number*sign;
         
    }
}