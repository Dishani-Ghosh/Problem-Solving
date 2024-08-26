class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char []as=s.toCharArray();
        char []at=t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);
        return Arrays.equals(as,at);
    }
}