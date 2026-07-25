class Solution {
 
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