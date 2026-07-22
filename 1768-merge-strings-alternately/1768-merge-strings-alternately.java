class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int w=m+n;
        int length=n;
        if(m>n){
            length=n;
        }
        else{
            length=m;
        }
       StringBuilder s = new StringBuilder(w);
       for(int i=0; i<length; i++){
        s.append(word1.charAt(i)).append(word2.charAt(i));
       }
       if(length==m){
        for(int i=m; i<n; i++){
            s.append(word2.charAt(i));
        }
       }
       else if(length==n){
        for(int i=n; i<m; i++){
            s.append(word1.charAt(i));
        }
       }

        return s.toString();
    }
}