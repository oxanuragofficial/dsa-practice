class Solution {
    public String multiply(String num1, String num2) {
       
StringBuilder s = new StringBuilder();
if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] resultArr = new int[num1.length() + num2.length()];


        for (int i = num1.length() - 1; i >= 0; i--) {
    for (int j = num2.length() - 1; j >= 0; j--) {
        int n1 = num1.charAt(i) - '0';
        int n2 = num2.charAt(j) - '0';
        
        // Simplified position and summation logic
        int p = i + j + 1;
        int sum = (n1 * n2) + resultArr[p];

        resultArr[p] = sum % 10;
        resultArr[p - 1] += sum / 10;
    }
}
for (int i = 0; i < resultArr.length; i++) {
            // Skip leading zeros
            if (s.length() == 0 && resultArr[i] == 0) {
                continue;
            }
            s.append(resultArr[i]);
        }

        // Return the final result string
        return s.length() == 0 ? "0" : s.toString();

    }
}