class Solution {
    public int firstUniqChar(String s) {
        int [] count=new int[26];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(count[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}