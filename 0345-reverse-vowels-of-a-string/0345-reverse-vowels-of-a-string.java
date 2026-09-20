class Solution {
    public String reverseVowels(String s) {
      char[] arr = s.toCharArray();
       int left=0;
       int right=s.length()-1;

      while(left<right){
        while(left<right && !isvowel(arr[left])){
            left++;
        }
        while(left<right && !isvowel(arr[right])){
            right--;
        }
        char temp=arr[left];
        arr[left]=arr[right];
    arr[right]=temp;

        left++;
        right--;
      } 
      return new String(arr);
    }
    private boolean isvowel(char ch){
        return ch=='A'|| ch=='I' || ch=='O' || ch=='E' || ch=='U' || ch=='a'|| ch=='i' || ch=='o' || ch=='e' || ch=='u' ;

    }
}