import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // Split the string into words
        
        if (pattern.length() != words.length) // Compare pattern length with number of words
            return false;
        
        HashMap<Character, String> hpp = new HashMap<>(); // Map character to word
        HashMap<String, Character> htt = new HashMap<>(); // Map word to character
        
        for (int i = 0; i < pattern.length(); i++) {
            char pp = pattern.charAt(i);
            String ss = words[i];
            
            if (hpp.containsKey(pp)) {
                if (!hpp.get(pp).equals(ss)) // Check if existing mapping is consistent
                //here we use equals bcz word is string
                    return false;
            } else {
                hpp.put(pp, ss);
            }
            
            if (htt.containsKey(ss)) {
                if (htt.get(ss) != pp) // Check if reverse mapping is consistent
                    return false;
            } else {
                htt.put(ss, pp);
            }
        }
        
        return true;
    }
}
