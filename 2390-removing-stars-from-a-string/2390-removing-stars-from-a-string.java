class Solution {
    public String removeStars(String s) {
        Stack<Character> word = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if (!word.isEmpty()&&s.charAt(i)=='*') {
                word.pop();
            }
            else{
                word.push(s.charAt(i));
            }
        
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.size(); i++){
            sb.append(word.get(i));
        }

        return sb.toString();


    }
}