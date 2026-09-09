class Solution {
    public long countCommas(long n) {
        long commas=0;
        long mul=1000;

        while(n>=mul){
            commas+=(n-mul+1);

            if(mul>Long.MAX_VALUE / 1000){
                break;
            }
            mul*=1000;
        }
        return commas;
        
    }
}