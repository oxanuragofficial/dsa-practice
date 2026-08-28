class Solution {
    public int arrangeCoins(int n) {
        int count=0;
    int m=1;
    while(n>=m){
        n=n-m;
        m++;
        count++;
    }
        return count;
    }
}