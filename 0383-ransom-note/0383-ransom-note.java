class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
        return false;
        int []alphabet_counter=new int[26];
        for(char c:magazine.toCharArray())
        alphabet_counter[c-'a']++;// we count every character use ascii when we substract any alphabet with a then we get ascii value of this alphabet
//and we increment value if any alphabet is more than one
        for(char c:ransomNote.toCharArray()){
        if(alphabet_counter[c-'a']==0)// if ransomnote does not have any value
        return false;
        alphabet_counter[c-'a']--;
        }
        return true;
    }}

        /*
      char r[]=ransomNote.toCharArray();
      char m[]=magazine.toCharArray();
      Arrays.sort(r);
      Arrays.sort(m);
      String rr=String.toString(r);
      String mm=String.toString(m);
      for(int i=0;i<rr.length();i++)
      {
        if(rr.charAt(i)!=mm.charAt(i))
        return false;
        return true;
      }
      
    }
}*/