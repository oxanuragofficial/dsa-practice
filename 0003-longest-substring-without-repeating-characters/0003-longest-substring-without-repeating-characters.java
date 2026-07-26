class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0; i<n; i++){
            boolean[] visted=new boolean[256];
            int count=0;
            for(int j=i; j<n; j++){
            char ch=s.charAt(j);
            if(visted[ch]){
                break;
                
            }
            visted[ch]=true;
            count++;
            
        }
        if(count>max){
            max=count;
        }
        }
        return max;
    }
}