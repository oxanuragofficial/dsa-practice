class Solution {
    public String longestCommonPrefix(String[] strs) {
      int n=strs.length;
      StringBuilder s=new StringBuilder();
      Arrays.sort(strs);
      String first=strs[0];
      String last=strs[n-1];
      int min=Math.min(first.length(), last.length());
      for(int i=0; i<min; i++){
        if(first.charAt(i)==last.charAt(i)){
            s.append(first.charAt(i));
        }
        else{
            break;
        }
      }
      if(s.length()!=0){
        return s.toString();
      }
      return "";

    }
}