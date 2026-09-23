class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> ans=new ArrayList<>();
int i=0;
        while(i<chars.length){
            ans.add(chars[i]);

        int n=count(chars,chars[i],i);
        if(n>1){
         String numStr = Integer.toString(n);
                    for (char ch : numStr.toCharArray()) {
                        ans.add(ch);
                    }
        }
        i+=n;
            
        }

        for (int k = 0; k < ans.size(); k++) {
            chars[k] = ans.get(k);
        }

        return ans.size();
    }

    private int count(char[] c,char ch,int start){
        int count=0;
        for(int i=start; i<c.length; i++){
            if(c[i]==ch){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}