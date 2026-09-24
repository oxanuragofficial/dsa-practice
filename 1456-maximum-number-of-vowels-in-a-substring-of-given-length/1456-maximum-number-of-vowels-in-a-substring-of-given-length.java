class Solution {
    public int maxVowels(String s, int k) {
        int maxcount=0;
        int count=0;
        for(int i=0; i<k; i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        maxcount=count;
        for(int i=k; i<s.length(); i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }

    boolean isvowel(char ch){
        

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}