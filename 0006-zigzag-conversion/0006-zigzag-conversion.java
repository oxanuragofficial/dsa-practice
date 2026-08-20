class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0; 
        while (i < s.length()) {
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index].append(s.charAt(i++));
            }
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index].append(s.charAt(i++));
            }
        }

        StringBuilder res = new StringBuilder();
        for (int k = 0; k < ans.length; k++) {
            res.append(ans[k]);
        }

        return res.toString();
    }
}
