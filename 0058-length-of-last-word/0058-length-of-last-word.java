class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        int j=n-1;
        while(j>=0&&s.charAt(j)==' '){
            
                j--;
        }
        for(int i=0; i<=j; i++){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                count=0;
            }
        }
        return count;
    }
}