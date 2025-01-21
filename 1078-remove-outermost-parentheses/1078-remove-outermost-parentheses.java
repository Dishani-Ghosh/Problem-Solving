class Solution {
    public String removeOuterParentheses(String s) {
      StringBuilder sb=new StringBuilder();
      int depth=0;
      char ch[]=s.toCharArray();
      for(char c:ch)
      {
        if(c=='(')
        {
            if(depth>0)
            {
                sb.append(c);
            }
            depth++;
        }
        if(c==')')
        {
            depth--;
            if(depth>0)
            {
                sb.append(c);
            }
        }
      }
      return sb.toString();  
    }
}