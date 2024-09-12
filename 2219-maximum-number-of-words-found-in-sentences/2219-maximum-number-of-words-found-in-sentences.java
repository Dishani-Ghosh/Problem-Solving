class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen=0;
        for(String ss:sentences)
        {
            String sp[]=ss.split(" ");
            int count=sp.length;
            maxlen=Math.max(maxlen,count);
        }
        return maxlen;
    }
}