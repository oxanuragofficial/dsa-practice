class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            if (word.contains(String.valueOf((char)(ch + 32))) || word.contains(String.valueOf((char)(ch - 32)))) {
            count++;
            set.add(ch);
            }
        }
        return set.size()/2;
    }
}