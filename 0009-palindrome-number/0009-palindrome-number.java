class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        if(x<0) return false;
        int temp=x;
        while(temp!=0){
            int digit=temp%10; 
            rev=rev*10+digit;
            temp/=10;

        }
        if(rev==x)return true;
        else return false;

        
    }
}