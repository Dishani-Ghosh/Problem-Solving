class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        /*
        String w1=String.join("",word1);
        String w2=String.join("",word2);
        return w1.equals(w2);
        */
//OR

    StringBuilder w1=new StringBuilder();
    StringBuilder w2=new StringBuilder();
    for(String s:word1)
    {
        w1.append(s);
    }
    for(String ss:word2)
    {
        w2.append(ss);
    }
    return w1.toString().equals(w2.toString());
    }
}