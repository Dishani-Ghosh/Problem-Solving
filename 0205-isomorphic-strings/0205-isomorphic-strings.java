class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>hss=new HashMap<>();
        HashMap<Character,Character>htt=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            if(hss.containsKey(ss))
            {
                if(hss.get(ss)!=tt)
                return false;
            }
            else
            hss.put(ss,tt);
            if(htt.containsKey(tt))
            {
                if(htt.get(tt)!=ss)
                return false;
            }
            else 
            htt.put(tt,ss);
        }
        return true;
    }
}