class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean[] visited = new boolean[256];
            int count = 0;

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                count++;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}