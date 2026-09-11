import java.util.HashSet;

class Solution {
    public int totalNumbers(int[] digits) {
        // Step 1: Count how many times each digit (0-9) appears in our input
        int[] availableFreq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            availableFreq[digits[i]]++;
        }

        int count = 0;

        // Step 2: Loop through every possible 3-digit even number
        // Starts at 100 (first 3-digit number), steps by 2 to stay even, ends at 998
        for (int num = 100; num <= 998; num += 2) {
            
            // Extract individual digits of the candidate number
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;

            // Step 3: Count the frequency requirements of this candidate number
            int[] requiredFreq = new int[10];
            requiredFreq[hundreds]++;
            requiredFreq[tens]++;
            requiredFreq[units]++;

            // Step 4: Validate if we have enough matching digits in our pool
            boolean isValidCombination = true;
            for (int i = 0; i < 10; i++) {
                if (availableFreq[i] < requiredFreq[i]) {
                    isValidCombination = false;
                    break; // Missing required digit, skip this number
                }
            }

            // If we have all needed digits, track it
            if (isValidCombination) {
                count++;
            }
        }

        return count;
    }
}
