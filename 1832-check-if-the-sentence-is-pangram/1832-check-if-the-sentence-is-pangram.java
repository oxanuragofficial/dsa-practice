class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[]=new boolean[26];
        for(int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i)-'a']=true;
            
        }
        boolean ans=true;
        for(int i=0; i<arr.length; i++){
            ans=ans && arr[i];
        }
        return ans;
    }
}