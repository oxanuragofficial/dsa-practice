class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean ans=false;
        int n=ransomNote.length();
        int m=magazine.length();
       boolean []check=new boolean[m];
       if(m<n){
        return false;
       }
        for(int i=0; i<n; i++){
            boolean foundmatch=false;
            for(int j=0; j<m; j++){
                if(!check[j]&&ransomNote.charAt(i)==magazine.charAt(j)){
                   
                    foundmatch=true;
                    check[j]=true;
                    break;
                }
                
            }
            if(!foundmatch){
                return false;
            }
        }
        return true;
    }
}