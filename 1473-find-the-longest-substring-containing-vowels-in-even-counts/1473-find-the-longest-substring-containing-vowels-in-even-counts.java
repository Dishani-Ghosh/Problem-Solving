class Solution {
    public int findTheLongestSubstring(String s) {
       //use bit mask
       //The idea is to use a bit mask to track the parity (even or odd) of the occurrence of each vowel.
       int n=s.length();
       int mask=0;
       int maxlen=0;
       HashMap<Integer,Integer>hpp=new HashMap<>();
       hpp.put(0,-1);
       for(int i=0;i<n;i++)
       {
        char c=s.charAt(i);
        if(c=='a')
        mask=mask^(1<<0);
        else if(c=='e')
         mask=mask^(1<<1);
        else if(c=='i')
         mask=mask^(1<<2);
        else if(c=='o')
        mask=mask^(1<<3);
        else if(c=='u')
        mask=mask^(1<<4);

        if(hpp.containsKey(mask))
        {
            maxlen=Math.max(maxlen,i-hpp.get(mask));
        }
        else
        hpp.put(mask,i);
       } 
       return maxlen;
    }
}