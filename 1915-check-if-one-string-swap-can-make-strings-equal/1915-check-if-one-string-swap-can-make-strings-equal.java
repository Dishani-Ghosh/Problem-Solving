class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) 
            return true;  // Already equal, no swap needed

        int n = s1.length();
        int first = -1, second = -1; // Indices of mismatched characters
        int cnt = 0; 

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
                if (cnt == 1) first = i;
                else if (cnt == 2) second = i;
                else return false; // More than 2 mismatches → cannot be swapped
            }
        }

        // Swap is only possible if exactly two mismatches exist and they can be swapped
        return cnt == 2 && 
               s1.charAt(first) == s2.charAt(second) && 
               s1.charAt(second) == s2.charAt(first);
    }
}
