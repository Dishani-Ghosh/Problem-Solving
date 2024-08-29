class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int cnt=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            depth++;
            else if(c==')')
            depth--;
            cnt=Math.max(cnt,depth);
        }
        return cnt;
    }
}