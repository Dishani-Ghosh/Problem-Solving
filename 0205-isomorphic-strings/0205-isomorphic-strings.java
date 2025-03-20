class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>sp=new HashMap<>();
        HashMap<Character,Character>tp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(sp.containsKey(sc))
            {
                if(sp.get(sc)!=tc)
                return false;
            }
            sp.put(sc,tc);
            if(tp.containsKey(tc))
            {
                if(tp.get(tc)!=sc)
                return false;
            }
            tp.put(tc,sc);
            
        }
        return true;
    }
}