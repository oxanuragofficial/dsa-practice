class Solution {
    public static String integerof(int n){
        if(n==9) return "IX";
        if(n==8) return "VIII";
        if(n==7) return "VII";
        if(n==6) return "VI";
        if(n==5) return "V";
        if(n==4) return "IV";
        if(n==3) return "III";
        if(n==2) return "II";
        if(n==1) return "I";

        return "";
    }
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
       int[] arr1 = {
    1000, 900, 500, 400, 100, 90,
    50, 40, 10, 9, 5, 4, 1
};
       String[] st = {
    "M", "CM", "D", "CD", "C", "XC",
    "L", "XL", "X", "IX", "V", "IV", "I"
};
       for(int i=0; i<arr1.length; i++){
        while(num >= arr1[i]){
            num-=arr1[i];
            s.append(st[i]);

        }
       }
        return s.toString();
    }
}