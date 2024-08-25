class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character>hs=new HashMap<>();
        HashMap<Character,Character>ht=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            if(hs.containsKey(ss))
            {
                if(hs.get(ss)!=tt)
                return false;
            }
            else
            {
                hs.put(ss,tt);
            }

            if(ht.containsKey(tt))
            {
                if(ht.get(tt)!=ss)
                return false;
            }
            else
            {
                ht.put(tt,ss);
            }
        }
        return true;
    }
}