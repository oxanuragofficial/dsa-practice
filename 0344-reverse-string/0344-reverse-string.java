class Solution {
    public void reverseString(char[] s) {
        // int index=s.length-1;
        // char [] temp=new char[s.length];
        // for(int i=0; i<s.length; i++){
        //     temp[index]=s[i];
        //   index--;
        // }
        // for(int i=0; i<s.length; i++){
        //     s[i]=temp[i];
          
        // }
        int left=0;
        int right=s.length-1;
        while(left<=right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}