class Solution {
    public String restoreString(String s, int[] indices) {
     char restore[]=new char[s.length()];
      for(int i=0;i<indices.length;i++)
      {
        restore[indices[i]]=s.charAt(i);
      }  
      return new String(restore);
    }
}