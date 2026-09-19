class Solution {
    public String largestNumber(int[] nums) {
       String [] ch=new String[nums.length];

       
        for(int i=0; i<nums.length; i++){
            ch[i]=String.valueOf(nums[i]);
        }

        for(int i=0; i<ch.length; i++){
            for(int j=0; j<ch.length-i-1; j++){
                if(swap(ch[j],ch[j+1])){
                    String temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }

        if(ch[0].equals("0")){
            return "0";
        }

        String res="";
        for(int i=0; i<ch.length; i++){
            res+=ch[i];
        }
        return res;
        
    }

    public String intToSting(int n){
        String res="";
        while(n!=0){
            int digit=n%10;
            res+=(char)(digit+'0');
            n/=10;
        }
        return res;
    }

    public boolean swap(String s1,String s2){
        String com1=s1+s2;
        String com2=s2+s1;
        for(int i=0; i<com1.length(); i++){
            if(com1.charAt(i)>com2.charAt(i)){
                return false;
            }
           else if(com2.charAt(i)>com1.charAt(i)){
            return true;
           }
        }
        return false;
    }
}