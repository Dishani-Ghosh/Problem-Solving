class Solution {
    public int getLucky(String s, int k) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           int res=((s.charAt(i))-'a')+1; 
           ans.append(res);
        }
        //perform the transformation k times
        int opp=0;
        while(k>0)
        {
            opp=0;
        for(int i=0;i<ans.length();i++)
        {
            int digit=ans.charAt(i)-'0';
            opp=opp+digit;//18
        }
        ans=new StringBuilder(Integer.toString(opp));
        k--;
        }
        return opp;
    }
}